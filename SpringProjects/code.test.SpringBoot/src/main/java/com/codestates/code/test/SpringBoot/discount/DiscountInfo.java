package com.codestates.code.test.SpringBoot.discount;

import com.codestates.code.test.SpringBoot.user.User;

public interface DiscountInfo {

    int discount(User user, int Price);
}
