package com.esl.sparkdemo.entity;

import lombok.Data;

@Data
public class Ads {
    // 城市名称
    private String area;
    // 广告点击流统计结果
    private String count;
    // 广告id
    private String adId;
}
