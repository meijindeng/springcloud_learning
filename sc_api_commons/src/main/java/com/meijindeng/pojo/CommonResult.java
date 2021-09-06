package com.meijindeng.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.HashMap;

/**
 * @description: CommonResultx封装返回数据
 * @Author: dengmeijin
 * @Date: 2021/9/6 10:43
 */
@Data
@NoArgsConstructor
//@AllArgsConstructor
@Accessors(chain = true)
public class CommonResult extends HashMap<String, Object> {
    //状态码
    public static final String CODE_TAG = "code";
    //操作说明（是否成功）
    public static final String MSG_TAG = "message";
    //返回数据
    public static final String DATA_TAG = "data";

    //初始化一个新创建的 CommonResult 对象
    public CommonResult(int code, String message) {
        super.put(CODE_TAG, code);
        super.put(MSG_TAG, message);
    }
    public CommonResult(int code, String message, Object data)
    {
        super.put(CODE_TAG, code);
        super.put(MSG_TAG, message);
        super.put(DATA_TAG, data);
    }

    //返回成功消息
    public static CommonResult success(String message) {
        return CommonResult.success(message);
    }

    public static CommonResult error(String message){
        return CommonResult.error(message);
    }
}
