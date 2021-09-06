package com.meijindeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description: EurekaServerApplication1启动类
 * @Author: dengmeijin
 * @Date: 2021/9/6 17:25
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication1 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication1.class,args);
    }
}
