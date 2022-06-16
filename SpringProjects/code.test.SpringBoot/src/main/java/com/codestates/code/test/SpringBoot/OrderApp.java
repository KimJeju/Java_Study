package com.codestates.code.test.SpringBoot;

import com.codestates.code.test.SpringBoot.discount.CurrentDiscountInfo;
import com.codestates.code.test.SpringBoot.user.User;
import com.codestates.code.test.SpringBoot.user.UserGrade;

public class OrderApp {
    public static void main(String[] args) {

        CurrentDiscountInfo discountInfo = new CurrentDiscountInfo();

        User user = new User(0L,"kimCoding",UserGrade.GRABLE_1);
        int discountedPrice = discountInfo.discount(user,5000);

        if(discountedPrice == 500){
            System.out.println("회원등급에 알맞은 할인이 적용되었습니다");
            System.out.println("1등급 회원으로 5000 => " + discountedPrice);
        }

        user = new User(0L,"김건휘",UserGrade.GRABLE_2);
        discountedPrice = discountInfo.discount(user,5000);

        if(discountedPrice == 1000){
            System.out.println("회원등급에 알맞은 할인이 적용 되었습니다.");
            System.out.println("2등급 회원으로 5000 => " + discountedPrice);
        }

    }
}
