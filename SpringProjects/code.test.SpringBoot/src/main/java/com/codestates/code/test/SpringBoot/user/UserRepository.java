package com.codestates.code.test.SpringBoot.user;

public interface UserRepository {

    void saveUser(User user);
    User findByUserId(Long userId);
}
