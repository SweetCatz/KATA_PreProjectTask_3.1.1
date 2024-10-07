package web.dao;

import web.entity.User;

import java.util.List;

public interface UserDao {
    List<User> getUsersList();

    void saveUser(User user);

    User getUserById(Long id);

    void updateUser(User user);

    void deleteUser(Long id);
}
