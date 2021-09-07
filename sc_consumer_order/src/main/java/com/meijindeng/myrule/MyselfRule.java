package com.meijindeng.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: MyselfRule
 * @Author: dengmeijin
 * @Date: 2021/9/7 14:53
 */
//自定义负载均衡路由规则类
@Configuration
public class MyselfRule {
    @Bean
    public IRule myRule(){
        //return new RoundRobinRule();//轮询
        return new RandomRule();//随机
    }
}
