package com.bx.implatform.config;

import com.bx.implatform.config.props.AuthInterceptorProperties;
import com.bx.implatform.interceptor.AuthInterceptor;
import com.bx.implatform.interceptor.XssInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    private final AuthInterceptor authInterceptor;
    private final XssInterceptor xssInterceptor;
    private final AuthInterceptorProperties authInterceptorProperties;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(xssInterceptor).addPathPatterns("/**").excludePathPatterns("/error");
        registry.addInterceptor(authInterceptor).addPathPatterns("/**").excludePathPatterns(authInterceptorProperties.getExcludePaths().toArray(new String[0]));
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        // 使用BCrypt加密密码
        return new BCryptPasswordEncoder();
    }

    public MvcConfig(final AuthInterceptor authInterceptor, final XssInterceptor xssInterceptor, final AuthInterceptorProperties authInterceptorProperties) {
        this.authInterceptor = authInterceptor;
        this.xssInterceptor = xssInterceptor;
        this.authInterceptorProperties = authInterceptorProperties;
    }
}
