package com.chinamobile.demo.dao;

import com.chinamobile.demo.entity.NetworkResource;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NetworkResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NetworkResource record);

    int insertSelective(NetworkResource record);

    NetworkResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NetworkResource record);

    int updateByPrimaryKey(NetworkResource record);

    List<NetworkResource> selectResourceListByPosition(@Param("swLng") Double swLng,
                                                     @Param("neLng") Double neLng,
                                                     @Param("swLat") Double swLat,
                                                     @Param("neLat") Double neLat);

    List<NetworkResource> selectResourceByPosition(@Param("lng") Double lng,
                                                   @Param("lat") Double lat);

    List<NetworkResource> selectResourceListByAOI(@Param("aoiId") String aoiId);

    int selectResourceNumByAOI(@Param("aoiId") String aoiId);
}