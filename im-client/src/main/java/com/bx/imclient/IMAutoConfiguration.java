package com.bx.imclient;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.bx.imclient", "com.bx.imcommon"})
public class IMAutoConfiguration {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(IMAutoConfiguration.class);
}
