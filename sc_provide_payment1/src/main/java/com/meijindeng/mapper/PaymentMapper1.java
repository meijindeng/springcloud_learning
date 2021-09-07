package com.meijindeng.mapper;

import com.meijindeng.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @description: PaymentMapper1
 * @Author: dengmeijin
 * @Date: 2021/9/7 9:32
 */
@Mapper
@Repository
public interface PaymentMapper1 {
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
