package com.codestates.code.test.SpringBoot.discount;
import com.codestates.code.test.SpringBoot.user.User;
import com.codestates.code.test.SpringBoot.user.UserGrade;

public class RateDiscountInfo implements DiscountInfo{

    private int grade_1_Rate = 5;
    private int grade_2_Rate = 10;

    @Override
    public int discount(User user,int price){
        if(user.getUserGrable() == UserGrade.GRABLE_1){
            return price * grade_1_Rate / 100;
        }else if(user.getUserGrable() == UserGrade.GRABLE_2){
            return price * grade_2_Rate / 100;
        }

        return 0;
    }
}
