package com.grupp4.edufy.apigatewayservice;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "sotis";
        // String rawPassword = "Bu11en";
        String encodePassword = encoder.encode(rawPassword);
        System.out.println(encodePassword);
    }
}
