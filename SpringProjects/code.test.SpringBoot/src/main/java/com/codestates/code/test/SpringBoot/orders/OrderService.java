package com.codestates.code.test.SpringBoot.orders;

public interface OrderService {
    Order createOrder(Long userId, String iTemName, int iTemPrice);
}
