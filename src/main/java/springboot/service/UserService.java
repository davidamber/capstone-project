package springboot.service;

import java.util.List;
import springboot.model.User;

public interface UserService {
    List <User> getAllUsers();
    void saveUser(User user);

    static User getUserById(long id) {
        return null;
    }

    void deleteUserById(long id);

    void showUser(User user);
}