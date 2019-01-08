package com.sportspro.service;

import com.sportspro.model.entities.User;
import com.sportspro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultUserService implements UserService {
    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        return new User();
    }
}
