package com.spring.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class CalculatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
    }
}

//TODO: remove default 0 value from calculator input form
//TODO: fix changing result value with many numbers after decimal point

//TODO: Only show user calculations (admins see all calculations)


