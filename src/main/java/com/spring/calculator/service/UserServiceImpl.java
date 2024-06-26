package com.spring.calculator.service;

import com.spring.calculator.model.User;
import com.spring.calculator.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    @Qualifier("BCryptPasswordEncoder")
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    public void save(User user){
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        //Default role will always be USER when creating a new account
        user.setRole("ROLE_USER");
        userRepository.save(user);
    }
    @Override
    public User findByUsername(String username){
        return userRepository.findByUsername(username);
    }
}
