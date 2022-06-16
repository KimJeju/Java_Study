package com.codestates.code.test.SpringBoot.user;

public class UserServiceImpl implements UserService{

    private  final UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public void signUp(User user) {
        userRepository.saveUser(user);
    }

    @Override
    public User findUser(Long userId) {
        return userRepository.findByUserId(userId);
    }
}
