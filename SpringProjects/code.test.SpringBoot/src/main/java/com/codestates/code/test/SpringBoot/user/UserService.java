package com.codestates.code.test.SpringBoot.user;

public interface UserService {

    void signUp(User user);
    User findUser(Long userId);
}
