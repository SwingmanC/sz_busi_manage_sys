package com.chinamobile.demo.service;

import com.chinamobile.demo.entity.NetworkCable;
import com.chinamobile.demo.entity.NetworkFiber;
import com.chinamobile.demo.entity.NetworkResource;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NetworkService {

    List<NetworkCable> selectCableListByPosition(double swLng,
                                                 double neLng,
                                                 double swLat,
                                                 double neLat);
    List<NetworkCable> selectCableByPosition(double lng,double lat);

    List<NetworkResource> selectResourceListByPosition(double swLng,
                                                       double neLng,
                                                       double swLat,
                                                       double neLat);
    List<NetworkResource> selectResourceByPosition(double lng,double lat);

    List<NetworkResource> selectResourceListByAOI(String aoiId);

    int selectResourceNumByAOI(String aoiId);

    List<NetworkFiber> selectFiberListByPosition(double swLng,
                                                 double neLng,
                                                 double swLat,
                                                 double neLat);
    List<NetworkFiber> selectFiberByPosition(double lng,double lat);

    List<NetworkFiber> selectFiberListByAOI(String aoiId);

    int selectFiberNumByAOI(String aoiId);
}
