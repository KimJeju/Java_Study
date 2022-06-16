package user;

import java.util.HashMap;

public class UserRepositoryImpl implements userRepository{

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
