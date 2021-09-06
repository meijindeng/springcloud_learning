package com.meijindeng.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @description: Payment支付实体类
 * @Author: dengmeijin
 * @Date: 2021/9/6 10:40
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Payment implements Serializable {
    //id
    private Long id;
    //支付商家
    private String serial;
}
