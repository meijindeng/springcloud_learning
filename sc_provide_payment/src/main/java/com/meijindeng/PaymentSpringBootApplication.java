package com.meijindeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description: PaymentSpringBootApplication启动类
 * @Author: dengmeijin
 * @Date: 2021/9/6 11:23
 */
@EnableEurekaClient
@EnableDiscoveryClient//服务发现注解
@SpringBootApplication
public class PaymentSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentSpringBootApplication.class,args);
    }
}
