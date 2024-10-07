package web.service;

import web.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUsersList();

    void saveUser(User user);

    User getUserById(Long id);

    void updateUser(User user);

    void deleteUser(Long id);
}
