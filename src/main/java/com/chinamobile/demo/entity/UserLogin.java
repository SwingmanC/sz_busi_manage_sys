package com.chinamobile.demo.entity;

public class UserLogin {
    private Integer id;

    private String username;

    private String password;

    public UserLogin(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public UserLogin() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
}