package com.meijindeng.service;

/**
 * @description: PaymentHystrixService
 * @Author: dengmeijin
 * @Date: 2021/9/7 17:26
 */
public interface PaymentHystrixService {
    /**
     * 正常访问
     * @param id
     * @return
     */
    String paymentInfo_OK(Integer id);

    /**
     * 超时访问
     * @param id
     * @return
     */
    String paymentInfo_TimeOut(Integer id);
}
