package com.chinamobile.demo.service.impl;

import com.chinamobile.demo.dao.AMapAOIBorderMapper;
import com.chinamobile.demo.dao.AMapAOIMapper;
import com.chinamobile.demo.entity.AMapAOI;
import com.chinamobile.demo.entity.AMapAOIBorder;
import com.chinamobile.demo.service.AOIService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AOIServiceImpl implements AOIService {

    @Resource
    private AMapAOIBorderMapper aMapAOIBorderMapper;

    @Resource
    private AMapAOIMapper aMapAOIMapper;

    @Override
    public List<AMapAOIBorder> selectBorderListByPosition(double swLng, double neLng, double swLat, double neLat) {
        return aMapAOIBorderMapper.selectBorderListByPosition(neLng,swLng,neLat,swLat);
    }

    @Override
    public AMapAOI selectAOIById(String aoiId) {
        return aMapAOIMapper.selectByPrimaryKey(aoiId);
    }
}
