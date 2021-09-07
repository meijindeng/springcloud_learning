package com.meijindeng;

import com.meijindeng.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @description: OrderSpringBootApplication
 * @Author: dengmeijin
 * @Date: 2021/9/6 14:45
 */
@EnableEurekaClient
@SpringBootApplication
//name为生产者服务的服务名称  configuration为配置类的类名
@RibbonClient(name = "sc-provide-payment",configuration = MyselfRule.class)
public class OrderSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderSpringBootApplication.class,args);
    }
}
