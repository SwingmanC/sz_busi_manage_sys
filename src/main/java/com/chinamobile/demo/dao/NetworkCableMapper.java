package com.chinamobile.demo.dao;

import com.chinamobile.demo.entity.NetworkCable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NetworkCableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NetworkCable record);

    int insertSelective(NetworkCable record);

    NetworkCable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NetworkCable record);

    int updateByPrimaryKey(NetworkCable record);

    List<NetworkCable> selectCableListByPosition(@Param("swLng") Double swLng,
                                                 @Param("neLng") Double neLng,
                                                 @Param("swLat") Double swLat,
                                                 @Param("neLat") Double neLat);

    List<NetworkCable> selectCableByPosition(@Param("lng") Double lng,
                                             @Param("lat") Double lat);
}