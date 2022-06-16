package com.codestates.code.test.SpringBoot.orders;

import com.codestates.code.test.SpringBoot.discount.CurrentDiscountInfo;
import com.codestates.code.test.SpringBoot.discount.DiscountInfo;
import com.codestates.code.test.SpringBoot.user.User;
import com.codestates.code.test.SpringBoot.user.UserRepository;
import com.codestates.code.test.SpringBoot.user.UserRepositoryImpl;
import com.codestates.code.test.SpringBoot.user.UserServiceImpl;

public class OrderServiceImpl implements OrderService{

//    private final UserRepository userRepository = new UserRepositoryImpl();
//    private final DiscountInfo discountInfo = new CurrentDiscountInfo();

    private final UserRepository userRepository;
    private final DiscountInfo discountInfo;

    public OrderServiceImpl(UserRepository userRepository, DiscountInfo discountInfo){
        this.userRepository = userRepository;
        this.discountInfo = discountInfo;
    }

    @Override
    public Order createOrder(Long userId, String iTemName, int iTemPrice) {
        User user = userRepository.findByUserId(userId);
        int discountPrice = discountInfo.discount(user,iTemPrice);

        return new Order(userId,iTemName,iTemPrice,discountPrice);
    }
}
