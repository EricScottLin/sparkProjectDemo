package com.esl.sparkdemo.entity;

import lombok.Data;

@Data
public class Top10 {
    private String cart_count;
    private String category_id;
    private String purchase_count;
    private String view_count;
}
