package com.chinamobile.demo.service.impl;

import com.chinamobile.demo.dao.NetworkCableMapper;
import com.chinamobile.demo.dao.NetworkFiberMapper;
import com.chinamobile.demo.dao.NetworkResourceMapper;
import com.chinamobile.demo.entity.NetworkCable;
import com.chinamobile.demo.entity.NetworkFiber;
import com.chinamobile.demo.entity.NetworkResource;
import com.chinamobile.demo.service.NetworkService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NetWorkServiceImpl implements NetworkService {

    @Resource
    private NetworkCableMapper networkCableMapper;

    @Resource
    private NetworkResourceMapper networkResourceMapper;

    @Resource
    private NetworkFiberMapper networkFiberMapper;

    @Override
    public List<NetworkCable> selectCableListByPosition(double swLng, double neLng, double swLat, double neLat) {
        return networkCableMapper.selectCableListByPosition(swLng,neLng,swLat,neLat);
    }

    @Override
    public List<NetworkCable> selectCableByPosition(double lng, double lat) {
        return networkCableMapper.selectCableByPosition(lng,lat);
    }

    @Override
    public List<NetworkResource> selectResourceListByPosition(double swLng, double neLng, double swLat, double neLat) {
        return networkResourceMapper.selectResourceListByPosition(swLng,neLng,swLat,neLat);
    }

    @Override
    public List<NetworkResource> selectResourceByPosition(double lng, double lat) {
        return networkResourceMapper.selectResourceByPosition(lng,lat);
    }

    @Override
    public List<NetworkResource> selectResourceListByAOI(String aoiId) {
        return networkResourceMapper.selectResourceListByAOI(aoiId);
    }

    @Override
    public int selectResourceNumByAOI(String aoiId) {
        return networkResourceMapper.selectResourceNumByAOI(aoiId);
    }

    @Override
    public List<NetworkFiber> selectFiberListByPosition(double swLng, double neLng, double swLat, double neLat) {
        return networkFiberMapper.selectFiberListByPosition(swLng,neLng,swLat,neLat);
    }

    @Override
    public List<NetworkFiber> selectFiberByPosition(double lng, double lat) {
        return networkFiberMapper.selectFiberByPosition(lng,lat);
    }

    @Override
    public List<NetworkFiber> selectFiberListByAOI(String aoiId) {
        return networkFiberMapper.selectFiberListByAOI(aoiId);
    }

    @Override
    public int selectFiberNumByAOI(String aoiId) {
        return networkFiberMapper.selectFiberNumByAOI(aoiId);
    }
}
