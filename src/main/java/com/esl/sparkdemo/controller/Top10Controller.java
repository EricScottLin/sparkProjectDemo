package com.esl.sparkdemo.controller;

import com.esl.sparkdemo.mapper.Top10Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class Top10Controller {
    @Resource
    private Top10Mapper top10Mapper;

    @RequestMapping("top10")
    public String top10(Model model){
        model.addAttribute("top10",top10Mapper.getTop10());
        return "top10";
    }
}
