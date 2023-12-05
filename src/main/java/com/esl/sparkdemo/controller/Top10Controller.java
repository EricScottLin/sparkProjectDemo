package com.esl.sparkdemo.controller;

import com.esl.sparkdemo.mapper.Top10Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Top10Controller {
    // Autowired注解用于声明类的属性，属性类型为接口类型
    @Autowired
    private Top10Mapper top10Mapper;

    // RequestMapping注解用于处理URL请求，将URL请求映射到方法中
    @RequestMapping("top10")
    public String top10(Model model) {
        model.addAttribute("top10", top10Mapper.getTop10());
        return "top10";
    }
}
