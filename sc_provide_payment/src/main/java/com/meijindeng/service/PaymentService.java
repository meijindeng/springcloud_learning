package com.meijindeng.service;

import com.meijindeng.pojo.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @description: PaymentService
 * @Author: dengmeijin
 * @Date: 2021/9/6 11:34
 */
public interface PaymentService {
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
