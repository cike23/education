package com.attech.core.base;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.base.insert.InsertMapper;

import java.util.List;

/**
 * 基础Mapper
 *
 * @author Aaron
 * @version v1.0
 * @create 2018-07-11 21:00
 **/
public interface Mapper<T> extends BaseMapper<T>, ConditionMapper<T>, IdsMapper<T>, InsertMapper<T>{

    /**
     * 批量插入，null的属性也会保存，不会使用数据库默认值
     *
     * @param recordList
     * @return
     */
    List<T> insertList(List<T> recordList);

}