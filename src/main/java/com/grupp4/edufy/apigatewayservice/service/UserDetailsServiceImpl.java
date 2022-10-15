package com.grupp4.edufy.apigatewayservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.grupp4.edufy.apigatewayservice.model.EdufyUserDetails;
import com.grupp4.edufy.apigatewayservice.model.User;
import com.grupp4.edufy.apigatewayservice.repository.UserRepository;

// @Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
   private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
      User user = userRepository.getUserByUsername(userName);
      if(user == null){
        throw new UsernameNotFoundException("could not find user: "+userName);
      }

      return new EdufyUserDetails(user);
    }
}
