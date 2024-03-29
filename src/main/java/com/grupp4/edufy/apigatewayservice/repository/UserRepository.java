package com.grupp4.edufy.apigatewayservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.grupp4.edufy.apigatewayservice.model.User;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    @Query ("SELECT u FROM User u WHERE u.username = :username")
    public User getUserByUsername(@Param("username") String username);
}