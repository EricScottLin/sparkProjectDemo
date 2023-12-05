package com.esl.sparkdemo.mapper;

import com.esl.sparkdemo.entity.Top10;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

// Mapper注解是Mybatis框架中定义的数据层接口，用于标记Mapper为映射接口
@Mapper
public interface Top10Mapper {
    // Select注解用于指定查询操作的SQL语句
    @Select("select \"cart_count\",\"category_id\",\"purchase_count\",\"view_count\" from \"top10\"")
    List<Top10> getTop10();
}
