package com.spring.calculator.controller;

import com.spring.calculator.model.User;
import com.spring.calculator.repositories.UserRepository;
import com.spring.calculator.service.UserService;
import com.spring.calculator.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {
    private final UserService userService;
    @Autowired
    private UserValidator userValidator;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserController(@Qualifier("UserService") UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/registracija")
    public String showRegistrationForm(Model model) {
        model.addAttribute("userForm", new User());
        return "registracija";
    }
    @PostMapping("/registracija")
    public String processRegistrationForm(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registracija";
        } else {
            userService.save(userForm);
            return "redirect:/prisijungti";
        }
    }
    @GetMapping("/prisijungti")
    public String login(Model model){
        model.addAttribute("userForm", new User());
        return "prisijungti";
    }
    @PostMapping("/loginUser")
    public String loginUser(@ModelAttribute("user") User loginUser, BindingResult result, RedirectAttributes redirectAttributes) {

        userValidator.validate(loginUser, result);

        if (result.hasErrors()) {
            redirectAttributes.addAttribute("error", "true");
            return "redirect:/prisijungti";
        }

        return "redirect:/calculator";
    }

}
