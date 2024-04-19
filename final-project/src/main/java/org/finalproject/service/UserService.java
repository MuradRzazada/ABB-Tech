package org.finalproject.service;

import org.finalproject.entity.User;

public interface UserService {
    void registerUser(User user);
    boolean loginUser(String username, String password);
}
