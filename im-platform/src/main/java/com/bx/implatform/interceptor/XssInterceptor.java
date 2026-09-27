package com.bx.implatform.interceptor;

import com.bx.implatform.enums.ResultCode;
import com.bx.implatform.exception.GlobalException;
import com.bx.implatform.util.XssUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import java.io.BufferedReader;
import java.util.Map;

@Component
public class XssInterceptor implements HandlerInterceptor {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(XssInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        // 检查参数
        Map<String, String[]> paramMap = request.getParameterMap();
        for (String[] values : paramMap.values()) {
            for (String value : values) {
                if (XssUtil.checkXss(value)) {
                    throw new GlobalException(ResultCode.XSS_PARAM_ERROR);
                }
            }
        }
        //  检查body
        String body = getBody(request);
        if (XssUtil.checkXss(body)) {
            throw new GlobalException(ResultCode.XSS_PARAM_ERROR);
        }
        return true;
    }

    private String getBody(HttpServletRequest request) {
        try {
            BufferedReader reader = request.getReader();
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
            return stringBuilder.toString();
        } catch (java.io.IOException e) {
            log.error("读取请求体失败: {}", e.getMessage());
            return "";
        }
    }
}
