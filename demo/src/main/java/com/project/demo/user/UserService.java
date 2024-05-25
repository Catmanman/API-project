package com.project.demo.user;

import com.project.demo.step.step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<com.project.demo.user.User> getAllUsers() {
        return userRepository.findAll();
    }

    public com.project.demo.user.User getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public com.project.demo.user.User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    public User updateUser(Long userId, User user) {
        if (userRepository.existsById(userId)) {
            user.setUserId(userId);
            return userRepository.save(user);
        }
        return null; 
    }
}

