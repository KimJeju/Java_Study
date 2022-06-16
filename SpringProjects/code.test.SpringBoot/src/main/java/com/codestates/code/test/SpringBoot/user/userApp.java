package com.codestates.code.test.SpringBoot.user;

import com.codestates.code.test.SpringBoot.AppConfig;

public class userApp {

    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
        AppConfig appConfig = new AppConfig();
        UserService userService = appConfig.userService();
        User user = new User(0L,"KimCoding", UserGrade.GRABLE_2);
        userService.signUp(user);

        User currentUser = userService.findUser(0L);
        System.out.println("Sign up User :" + user.getName());
        System.out.println("current User :" + currentUser.getName());

        if(user.getName().equals(currentUser.getName())){
            System.out.println("새롭게 가입한 사용자와 현재 사용자가 같습니다.");
        }
    }
}
