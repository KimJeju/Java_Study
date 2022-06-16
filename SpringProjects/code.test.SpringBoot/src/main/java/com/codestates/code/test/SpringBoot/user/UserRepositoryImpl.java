package com.codestates.code.test.SpringBoot.user;

import java.util.HashMap;

public class UserRepositoryImpl implements UserRepository {

    private static HashMap<Long, User> users = new HashMap<>();


    @Override
    public void saveUser(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public User findByUserId(Long userId) {
        return users.get(userId);
    }
}
