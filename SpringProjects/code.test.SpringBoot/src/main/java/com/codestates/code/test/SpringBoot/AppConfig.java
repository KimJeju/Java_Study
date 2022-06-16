package com.codestates.code.test.SpringBoot;

import com.codestates.code.test.SpringBoot.discount.RateDiscountInfo;
import com.codestates.code.test.SpringBoot.orders.OrderService;
import com.codestates.code.test.SpringBoot.orders.OrderServiceImpl;
import com.codestates.code.test.SpringBoot.discount.CurrentDiscountInfo;
import com.codestates.code.test.SpringBoot.discount.DiscountInfo;
import com.codestates.code.test.SpringBoot.user.UserRepositoryImpl;
import com.codestates.code.test.SpringBoot.user.UserRepository;
import com.codestates.code.test.SpringBoot.user.UserService;
import com.codestates.code.test.SpringBoot.user.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserService userService(){
        return new UserServiceImpl(UserRepository());
    }

    @Bean
    public UserRepository UserRepository(){
        return new UserRepositoryImpl();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(UserRepository(),discountInfo());
    }

    @Bean
    public DiscountInfo discountInfo(){
        //return new CurrentDiscountInfo();
        return new RateDiscountInfo();
    }

}
