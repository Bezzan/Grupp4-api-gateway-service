package com.grupp4.edufy.apigatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.grupp4.edufy.apigatewayservice.repository.*;


@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class ApiGatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayServiceApplication.class, args);
    }
}
