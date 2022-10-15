package com.grupp4.edufy.apigatewayservice.model;

import java.sql.Date;

import javax.persistence.*;

import com.fasterxml.jackson.databind.node.BooleanNode;

@Entity
@Table(name = "users")

public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String password;
    private String role;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    private Boolean enabled;

}

// public class User {
// @Id
// @GeneratedValue(strategy = GenerationType.AUTO)
// private int Id;
// private String UserName;
// private String Password;
// private Date Created;
// private boolean Enabled;
// @Column(name = "password_set")
// private Date PasswordSet;
// private String Roles;

// public Date getCreated() {
// return Created;
// }

// public void setCreated(Date created) {
// Created = created;
// }

// public Date getPasswordSet() {
// return PasswordSet;
// }

// public void setPasswordSet(Date passwordSet) {
// PasswordSet = passwordSet;
// }

// public int getId() {
// return Id;
// }

// public void setId(int id) {
// this.Id = id;
// }

// public String getUserName() {
// return UserName;
// }

// public void setUserName(String userName) {
// this.UserName = userName;
// }

// public String getPassword() {
// return Password;
// }

// public void setPassword(String password) {
// this.Password = password;
// }

// public boolean isEnabled() {
// return Enabled;
// }

// public void setEnabled(boolean enabled) {
// this.Enabled = enabled;
// }

// public String getRoles() {
// return Roles;
// }

// public void setRoles(String roles) {
// this.Roles = roles;
// }

// public Object map(Object object) {
// return null;
// }
// }