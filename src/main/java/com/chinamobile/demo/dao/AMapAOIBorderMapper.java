package com.chinamobile.demo.dao;

import com.chinamobile.demo.entity.AMapAOIBorder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AMapAOIBorderMapper {
    int deleteByPrimaryKey(String aoiId);

    int insert(AMapAOIBorder record);

    int insertSelective(AMapAOIBorder record);

    AMapAOIBorder selectByPrimaryKey(String aoiId);

    int updateByPrimaryKeySelective(AMapAOIBorder record);

    int updateByPrimaryKeyWithBLOBs(AMapAOIBorder record);

    int updateByPrimaryKey(AMapAOIBorder record);

    List<AMapAOIBorder> selectBorderListByPosition(@Param("neLng") Double neLng,
                                                   @Param("swLng") Double swLng,
                                                   @Param("neLat") Double neLat,
                                                   @Param("swLat") Double swLat);
}