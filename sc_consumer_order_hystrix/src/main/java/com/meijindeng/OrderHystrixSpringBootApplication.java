package com.meijindeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description: OrderHystrixSpringBootApplication启动类
 * @Author: dengmeijin
 * @Date: 2021/9/8 9:41
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class OrderHystrixSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixSpringBootApplication.class,args);
    }
}
