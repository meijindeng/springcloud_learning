package com.meijindeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description: OrderSpringBootApplication
 * @Author: dengmeijin
 * @Date: 2021/9/6 14:45
 */
@EnableEurekaClient
@SpringBootApplication
public class OrderSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderSpringBootApplication.class,args);
    }
}
