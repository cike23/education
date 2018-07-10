package com.attech.core.base;

/**
 * Desc: 基础枚举接口
 * Author: Aaron
 * Time: 2018/7/10 23:30.
 * Version: v1.0
 */
public interface BaseEnum<K, V> {

    /**
     * 获取编码
     *
     * @return  编码
     */
    K code();

    /**
     * 获取描述
     *
     * @return  描述
     */
    V desc();

}
