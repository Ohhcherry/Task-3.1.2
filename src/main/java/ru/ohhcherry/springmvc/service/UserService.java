package ru.ohhcherry.springmvc.service;


import jakarta.validation.Valid;
import ru.ohhcherry.springmvc.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers ();
    Object getUserById(long id);
    void addUser(User user);
    void removeUser(long id);
    void updateUser(@Valid User user);
}