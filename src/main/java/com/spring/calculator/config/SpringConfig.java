package com.spring.calculator.config;

import com.spring.calculator.repositories.NumberRepository;
import com.spring.calculator.repositories.UserRepository;
import com.spring.calculator.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class SpringConfig {
    private final NumberRepository numberRepository;
    private final UserRepository userRepository;

    @Autowired
    public SpringConfig(NumberRepository numberRepository, UserRepository userRepository) {
        this.numberRepository = numberRepository;
        this.userRepository = userRepository;
    }

    @Bean
    @Qualifier("NumberService")
    public NumberService getNumberService() {
        return new NumberServiceImpl();
    }
    @Bean
    @Qualifier("UserDetailsService")
    public UserDetailsService getuserDetailsService() {
        return new UserDetailsServiceImpl();
    }
    @Bean
    @Qualifier("UserService")
    public UserService getUserService() {
        return new UserServiceImpl();
    }
}
