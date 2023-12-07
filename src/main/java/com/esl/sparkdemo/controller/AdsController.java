package com.esl.sparkdemo.controller;

import com.esl.sparkdemo.entity.Ads;
import com.esl.sparkdemo.mapper.AdsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AdsController {
    // Autowired注解用于声明类的属性，属性类型为接口（AdsMapper）类型
    @Autowired
    private AdsMapper adsMapper;

    // RequestMapping注解用于处理URL的POST请求，将POST请求映射到方法中
    @RequestMapping(value = "/adsData", method = RequestMethod.POST)
    @ResponseBody
    public List<Ads> adsData() {
        return adsMapper.ads();
    }

    @RequestMapping(value = "/ads", produces = "text/html;charset=utf-8")
    public String ads() {
        return "ads";
    }
}
