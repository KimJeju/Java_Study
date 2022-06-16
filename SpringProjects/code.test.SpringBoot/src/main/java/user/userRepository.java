package user;

public interface userRepository {

    void saveUser(User user);
    User findByUserId(Long userId);
}
