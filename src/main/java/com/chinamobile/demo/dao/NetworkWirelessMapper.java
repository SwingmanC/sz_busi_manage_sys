package com.chinamobile.demo.dao;

import com.chinamobile.demo.entity.NetworkWireless;

public interface NetworkWirelessMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NetworkWireless record);

    int insertSelective(NetworkWireless record);

    NetworkWireless selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NetworkWireless record);

    int updateByPrimaryKey(NetworkWireless record);
}