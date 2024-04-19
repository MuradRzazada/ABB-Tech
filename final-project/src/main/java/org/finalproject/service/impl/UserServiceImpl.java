package org.finalproject.service.impl;

import org.finalproject.entity.User;
import org.finalproject.service.UserService;
import org.finalproject.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void registerUser(User user) {

    }

    @Override
    public boolean loginUser(String username, String password) {
        return false;
    }
}
