package com.meijindeng.service;

import com.meijindeng.pojo.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description: PaymentService
 * @Author: dengmeijin
 * @Date: 2021/9/7 15:40
 */
@ComponentScan
@FeignClient(value ="sc-provide-payment")//使用Feign
public interface PaymentService {
    @GetMapping("/payment/get/{id}")
    public CommonResult queryById(@PathVariable("id") Long id);
}
