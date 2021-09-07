package com.meijindeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description: OrderFeignSpringBootApplication启动类
 * @Author: dengmeijin
 * @Date: 2021/9/7 15:36
 */
@EnableFeignClients //注入Feign的注解
@SpringBootApplication
public class OrderFeignSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignSpringBootApplication.class,args);
    }
}
