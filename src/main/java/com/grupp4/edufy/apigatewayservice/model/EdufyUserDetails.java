package com.grupp4.edufy.apigatewayservice.model;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class EdufyUserDetails implements UserDetails {

    private User user;
    public EdufyUserDetails(User user){
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(user.getRole());
        return Arrays.asList(authority);
    }

    @Override
    public String getPassword() {
                return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}

// public class EdufyUserDetails implements UserDetails {

//     private String Username;
//     private String Password;
//     private boolean Enabled;
//     private List<GrantedAuthority> Authorities;

//     public EdufyUserDetails(User user) {
//         this.Username = user.getUserName();
//         this.Password = user.getPassword();
//         this.Enabled = user.isEnabled();
//         this.Authorities = Arrays.stream(user.getRoles().split(","))
//                     .map(SimpleGrantedAuthority::new)
//                     .collect(Collectors.toList());
//     }

//     @Override
//     public Collection<? extends GrantedAuthority> getAuthorities() {
//         return Authorities;
//     }

//     @Override
//     public String getPassword() {
//         return Password;
//     }

//     @Override
//     public String getUsername() {
//         return Username;
//     }

//     @Override
//     public boolean isAccountNonExpired() {
//         return true;
//     }

//     @Override
//     public boolean isAccountNonLocked() {
//         return true;
//     }

//     @Override
//     public boolean isCredentialsNonExpired() {
//         return true;
//     }

//     @Override
//     public boolean isEnabled() {
//         return Enabled;
//     }
    
// }
