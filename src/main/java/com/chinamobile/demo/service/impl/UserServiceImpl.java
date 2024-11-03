package com.chinamobile.demo.service.impl;

import com.chinamobile.demo.dao.UserLoginMapper;
import com.chinamobile.demo.entity.UserLogin;
import com.chinamobile.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserLoginMapper userLoginMapper;

    @Override
    public UserLogin selectUserLoginInfoByUsername(String username) {
        List<UserLogin> userLoginList = userLoginMapper.selectUserLoginInfoByUsername(username);
        if (userLoginList == null || userLoginList.isEmpty()){
            return null;
        }else {
            return userLoginList.get(0);
        }
    }
}
