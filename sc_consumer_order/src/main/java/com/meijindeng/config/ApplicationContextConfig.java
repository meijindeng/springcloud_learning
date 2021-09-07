package com.meijindeng.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @description: ApplicationContextConfig配置类：新建RestTemplate配置类注入到Spring中ioc容器中
 * @Author: dengmeijin
 * @Date: 2021/9/6 14:47
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    //RestTemplate 的负载均衡能力
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
