package com.bx.implatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(exposeProxy = true)
@ComponentScan(basePackages = {"com.bx"})
@MapperScan(basePackages = {"com.bx.implatform.mapper"})
@SpringBootApplication
public class IMPlatformApp {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(IMPlatformApp.class);

    public static void main(String[] args) {
        SpringApplication.run(IMPlatformApp.class, args);
    }
}
