package com.chinamobile.demo.service;

import com.chinamobile.demo.entity.UserLogin;

public interface UserService {

    UserLogin selectUserLoginInfoByUsername(String username);

}
