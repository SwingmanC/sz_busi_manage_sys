package com.chinamobile.demo.dao;

import com.chinamobile.demo.entity.NetworkFiber;
import com.chinamobile.demo.entity.NetworkResource;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NetworkFiberMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NetworkFiber record);

    int insertSelective(NetworkFiber record);

    NetworkFiber selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NetworkFiber record);

    int updateByPrimaryKey(NetworkFiber record);

    List<NetworkFiber> selectFiberListByPosition(@Param("swLng") Double swLng,
                                                 @Param("neLng") Double neLng,
                                                 @Param("swLat") Double swLat,
                                                 @Param("neLat") Double neLat);

    List<NetworkFiber> selectFiberByPosition(@Param("lng") Double lng,
                                             @Param("lat") Double lat);

    List<NetworkFiber> selectFiberListByAOI(@Param("aoiId") String aoiId);

    int selectFiberNumByAOI(@Param("aoiId") String aoiId);
}