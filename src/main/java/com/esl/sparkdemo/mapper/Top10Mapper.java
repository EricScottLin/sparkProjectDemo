package com.esl.sparkdemo.mapper;

import com.esl.sparkdemo.entity.Top10;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Top10Mapper {
    @Select("select \"cartcount\",\"categoryid\",\"purchasecount\",\"viewcount\" from \"top10\"")
    List<Top10> getTop10();
}
