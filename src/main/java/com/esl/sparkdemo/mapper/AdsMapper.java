package com.esl.sparkdemo.mapper;

import com.esl.sparkdemo.entity.Ads;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

// Mapper注解是MyBatis框架中定义的数据层接口，用于标记接口AdsMapper为映射接口
@Mapper
public interface AdsMapper {
    // Select注解用于指定查询操作的SQL语句
    @Select("select 'area', 'count', 'ad' from 'adstream'")
    List<Ads> ads();

}
