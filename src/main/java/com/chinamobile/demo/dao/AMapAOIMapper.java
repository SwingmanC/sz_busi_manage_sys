package com.chinamobile.demo.dao;

import com.chinamobile.demo.entity.AMapAOI;

public interface AMapAOIMapper {
    int deleteByPrimaryKey(String aoiId);

    int insert(AMapAOI record);

    int insertSelective(AMapAOI record);

    AMapAOI selectByPrimaryKey(String aoiId);

    int updateByPrimaryKeySelective(AMapAOI record);

    int updateByPrimaryKey(AMapAOI record);
}