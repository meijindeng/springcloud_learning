package com.meijindeng.service.impl;

import com.meijindeng.service.PaymentHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @description: PaymentHystrixServiceImpl
 * @Author: dengmeijin
 * @Date: 2021/9/7 17:29
 */
@Service
public class PaymentHystrixServiceImpl implements PaymentHystrixService {

    @Autowired
    private PaymentHystrixService paymentHystrixService;

    /**
     * 正常访问
     * @param id
     * @return
     */
    @Override
    public String paymentInfo_OK(Integer id) {
        return "线程池:" + Thread.currentThread().getName() + " 正常访问,id:" + id
                + "\t" + "哈哈~";
    }

    /**
     * 超时访问
     * @param id
     * @return
     */
    @Override
    public String paymentInfo_TimeOut(Integer id) {
        int timeNumber = 3;
        try {
            // 暂停3秒钟
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池:" + Thread.currentThread().getName() + " 超时访问,id:" + id
                + "\t" + "哈哈~  耗时(秒)" + timeNumber;
    }
}
