package com.bx.imclient.task;

import cn.hutool.core.util.StrUtil;
import com.bx.imcommon.mq.RedisMQConsumer;
import org.springframework.beans.factory.annotation.Value;

public abstract class AbstractMessageResultTask<T> extends RedisMQConsumer<T> {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(AbstractMessageResultTask.class);
    @Value("${spring.application.name}")
    private String appName;

    @Override
    public String generateKey() {
        return StrUtil.join(":", super.generateKey(), appName);
    }
}
