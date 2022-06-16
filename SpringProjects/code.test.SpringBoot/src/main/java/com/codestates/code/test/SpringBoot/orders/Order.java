package com.codestates.code.test.SpringBoot.orders;

public class Order {
    private Long userId;
    private String iTemName;
    private int itemPrice;
    private int discountPrice;

    public Order(Long userId, String iTemName, int itemPrice, int discountPrice){
        this.userId = userId;
        this.iTemName = iTemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }

    public Long getUserId(){
        return userId;
    }

    public void setUserId(Long userId){
        this.userId = userId;
    }

    public String getiTemName(){
        return iTemName;
    }

    public void setiTemName(String iTemName){
        this.iTemName = iTemName;
    }

    public int getItemPrice(){
        return itemPrice;
    }

    public void setItemPrice(int itemPrice){
        this.itemPrice = itemPrice;
    }

    public int getDiscountPrice(){
        return discountPrice;
    }

    public void setDiscountPrice(){
        this.discountPrice = discountPrice;
    }
}
