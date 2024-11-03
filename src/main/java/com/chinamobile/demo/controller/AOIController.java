package com.chinamobile.demo.controller;

import com.chinamobile.demo.entity.AMapAOI;
import com.chinamobile.demo.entity.AMapAOIBorder;
import com.chinamobile.demo.entity.vo.AOIInfoVO;
import com.chinamobile.demo.service.AOIService;
import com.chinamobile.demo.service.NetworkService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/aoi")
public class AOIController {

    @Resource
    private AOIService aoiService;

    @Resource
    private NetworkService networkService;

    @GetMapping("/list")
    public List<AMapAOIBorder> getAOIBorderList(@RequestParam("swLng") double swLng,
                                                @RequestParam("neLng") double neLng,
                                                @RequestParam("swLat") double swLat,
                                                @RequestParam("neLat") double neLat){
        return aoiService.selectBorderListByPosition(swLng,neLng,swLat,neLat);
    }

    @GetMapping("/info/{aoiId}")
    public AOIInfoVO getAOIInfo(@PathVariable("aoiId") String aoiId){
        AOIInfoVO aoiInfoVO = new AOIInfoVO();
        AMapAOI aMapAOI = aoiService.selectAOIById(aoiId);
        int resourceNum = networkService.selectResourceNumByAOI(aoiId);
        int fiberNum = networkService.selectFiberNumByAOI(aoiId);

        aoiInfoVO.setAoiName(aMapAOI.getAoiName());
        aoiInfoVO.setAddress(aMapAOI.getAddress());
        aoiInfoVO.setCenterLat(aMapAOI.getCenterLat());
        aoiInfoVO.setCenterLon(aMapAOI.getCenterLon());
        aoiInfoVO.setArea(aMapAOI.getArea());
        aoiInfoVO.setResourceNum(resourceNum);
        aoiInfoVO.setFiberNum(fiberNum);

        return aoiInfoVO;
    }
}
