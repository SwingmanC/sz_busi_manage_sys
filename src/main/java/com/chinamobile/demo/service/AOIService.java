package com.chinamobile.demo.service;

import com.chinamobile.demo.entity.AMapAOI;
import com.chinamobile.demo.entity.AMapAOIBorder;

import java.util.List;

public interface AOIService {

    List<AMapAOIBorder> selectBorderListByPosition(double swLng,
                                                   double neLng,
                                                   double swLat,
                                                   double neLat);
    AMapAOI selectAOIById(String aoiId);
}
