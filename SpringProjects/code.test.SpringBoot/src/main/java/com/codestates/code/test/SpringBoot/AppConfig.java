package com.codestates.code.test.SpringBoot;

import com.codestates.code.test.SpringBoot.orders.OrderService;
import com.codestates.code.test.SpringBoot.orders.OrderServiceImpl;
import com.codestates.code.test.SpringBoot.discount.CurrentDiscountInfo;
import com.codestates.code.test.SpringBoot.user.UserRepositoryImpl;
import com.codestates.code.test.SpringBoot.user.UserRepository;
import com.codestates.code.test.SpringBoot.user.UserService;
import com.codestates.code.test.SpringBoot.user.UserServiceImpl;

public class AppConfig {

    public UserService userService(){
        return new UserServiceImpl(new UserRepositoryImpl());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(new UserRepositoryImpl(),new CurrentDiscountInfo());
    }

}
