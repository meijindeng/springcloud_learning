package com.meijindeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description: GatewaySpringBootApplication
 * @Author: dengmeijin
 * @Date: 2021/9/10 9:44
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewaySpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewaySpringBootApplication.class,args);
    }
}
