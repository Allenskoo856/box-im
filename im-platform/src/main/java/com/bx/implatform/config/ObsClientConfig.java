package com.bx.implatform.config;

import com.bx.implatform.config.props.ObsProperties;
import com.obs.services.ObsClient;
import com.obs.services.ObsConfiguration;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 华为云 OBS 客户端配置
 *
 * @author Blue
 * @version 1.0
 */
@Configuration
public class ObsClientConfig {

    @Bean(destroyMethod = "close")
    public ObsClient obsClient(ObsProperties obsProps) {
        ObsConfiguration config = new ObsConfiguration();
        if (StringUtils.isNotBlank(obsProps.getEndpoint())) {
            config.setEndPoint(obsProps.getEndpoint());
        }
        String ak = StringUtils.defaultString(obsProps.getAccessKey(), "dummy-ak");
        String sk = StringUtils.defaultString(obsProps.getSecretKey(), "dummy-sk");
        return new ObsClient(ak, sk, config);
    }
}
