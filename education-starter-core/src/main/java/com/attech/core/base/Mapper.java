package com.attech.core.base;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.base.insert.InsertMapper;

/**
 * 基础Mapper
 *
 * @author Aaron
 * @version v1.0
 * @create 2018-07-11 21:00
 **/
public interface Mapper<T> extends BaseMapper<T>, ConditionMapper<T>, IdsMapper<T>, InsertMapper<T>{


}