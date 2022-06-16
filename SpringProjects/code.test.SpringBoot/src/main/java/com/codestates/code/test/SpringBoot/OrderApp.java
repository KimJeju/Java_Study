package com.codestates.code.test.SpringBoot;

import com.codestates.code.test.SpringBoot.orders.Order;
import com.codestates.code.test.SpringBoot.orders.OrderService;
import com.codestates.code.test.SpringBoot.user.User;
import com.codestates.code.test.SpringBoot.user.UserGrade;
import com.codestates.code.test.SpringBoot.user.UserService;

public class OrderApp {
    public static void main(String[] args) {


        AppConfig appConfig = new AppConfig();
        UserService userService = appConfig.userService();
        OrderService orderService = appConfig.orderService();

        Long userId = 0L;
        User user = new User(userId,"kimcoding",UserGrade.GRABLE_1);
        userService.signUp(user);

        Order order = orderService.createOrder(userId,"coffee",5000);

        System.out.println("Order =" + order);

    }
}
