package com.esl.sparkdemo.entity;

public class Top10 {
    private String cartcount;
    private String category_id;
    private String purchasecount;
    private String viewcount;

    public String getCartcount() {
        return cartcount;
    }

    public void setCartcount(String cartcount) {
        this.cartcount = cartcount;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getPurchasecount() {
        return purchasecount;
    }

    public void setPurchasecount(String purchasecount) {
        this.purchasecount = purchasecount;
    }

    public String getViewcount() {
        return viewcount;
    }

    public void setViewcount(String viewcount) {
        this.viewcount = viewcount;
    }

    @Override
    public String toString() {
        return "Top10{" +
                "cartcount='" + cartcount + '\'' +
                ", category_id='" + category_id + '\'' +
                ", purchasecount='" + purchasecount + '\'' +
                ", viewcount='" + viewcount + '\'' +
                '}';
    }
}
