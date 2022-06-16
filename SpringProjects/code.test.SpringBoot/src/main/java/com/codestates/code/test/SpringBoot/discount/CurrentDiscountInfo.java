package com.codestates.code.test.SpringBoot.discount;
import  com.codestates.code.test.SpringBoot.user.User;
import  com.codestates.code.test.SpringBoot.user.UserGrade;

public class CurrentDiscountInfo implements DiscountInfo{

    private int grade_1_Amount = 500;
    private int grade_2_Amount = 1000;

    public int discount(User user, int Price){
      if(user.getUserGrable() == UserGrade.GRABLE_1){
          return  grade_1_Amount;
      }else if(user.getUserGrable() == UserGrade.GRABLE_2){
          return  grade_2_Amount;
      }
      return 0;
    }
}
