package com.meijindeng.service;

import com.meijindeng.pojo.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @description: PaymentService1
 * @Author: dengmeijin
 * @Date: 2021/9/7 9:33
 */
public interface PaymentService1 {
    /**
     * 增加信息
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 查询信息
     * @param id
     * @return
     */
    Payment queryById(@Param("id") long id);
}
