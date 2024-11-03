package com.chinamobile.demo.dao;

import com.chinamobile.demo.entity.UserLogin;

import java.util.List;

public interface UserLoginMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserLogin record);

    int insertSelective(UserLogin record);

    UserLogin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserLogin record);

    int updateByPrimaryKey(UserLogin record);

    List<UserLogin> selectUserLoginInfoByUsername(String username);
}