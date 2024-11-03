package com.chinamobile.demo.controller;

import com.chinamobile.demo.entity.UserLogin;
import com.chinamobile.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password){
        UserLogin userLogin = userService.selectUserLoginInfoByUsername(username);
        if(userLogin == null) {
            return "null";
        } else {
            if(!password.equals(userLogin.getPassword())){
                return "null";
            } else {
                return "token-admin";
            }
        }
    }

}
