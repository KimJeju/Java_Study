package com.codestates.code.test.SpringBoot.user;

import com.codestates.code.test.SpringBoot.user.User;
import com.codestates.code.test.SpringBoot.user.UserGrable;
import com.codestates.code.test.SpringBoot.user.UserService;
import com.codestates.code.test.SpringBoot.user.UserServiceImpl;

public class userApp {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        User user = new User(0L,"KimCoding",UserGrable.GRABLE_2);
        userService.signUp(user);

        User currentUser = userService.findUser(0L);
        System.out.println("Sign up User :" + user.getId());
        System.out.println("current User :" + currentUser.getName());

        if(user.getName().equals(currentUser.getName())){
            System.out.println("새롭게 가입한 사용자와 현재 사용자가 같습니다.");
        }
    }
}
