package com.chinamobile.demo.controller;

import com.chinamobile.demo.entity.NetworkCable;
import com.chinamobile.demo.entity.NetworkFiber;
import com.chinamobile.demo.entity.NetworkResource;
import com.chinamobile.demo.service.NetworkService;
import com.chinamobile.demo.utils.RandomUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/network")
public class NetworkController {

    @Resource
    private NetworkService networkService;

    @GetMapping("/cables")
    public List<NetworkCable> getCableListByPosition(@RequestParam("swLng") double swLng,
                                                     @RequestParam("neLng") double neLng,
                                                     @RequestParam("swLat") double swLat,
                                                     @RequestParam("neLat") double neLat){
        return networkService.selectCableListByPosition(swLng,neLng,swLat,neLat);
    }

    @GetMapping("/cable")
    public NetworkCable getCableByPosition(@RequestParam("lng") double lng,
                                           @RequestParam("lat") double lat){
        List<NetworkCable> cableList = networkService.selectCableByPosition(lng,lat);
        if (cableList != null && !cableList.isEmpty()){
            return cableList.get(0);
        }
        return null;
    }

    @GetMapping("/resources")
    public List<NetworkResource> getResourceListByPosition(@RequestParam("swLng") double swLng,
                                                           @RequestParam("neLng") double neLng,
                                                           @RequestParam("swLat") double swLat,
                                                           @RequestParam("neLat") double neLat){
        return networkService.selectResourceListByPosition(swLng,neLng,swLat,neLat);
    }

    @GetMapping("/resource")
    public NetworkResource getResourceByPosition(@RequestParam("lng") double lng,
                                                 @RequestParam("lat") double lat){
        List<NetworkResource> resourceList = networkService.selectResourceByPosition(lng,lat);
        if (resourceList != null && !resourceList.isEmpty()){
            return resourceList.get(0);
        }
        return null;
    }

    @GetMapping("/resources/{aoiId}")
    public List<NetworkResource> getResourceListByAOI(@PathVariable("aoiId") String aoiId){
        return networkService.selectResourceListByAOI(aoiId);
    }

    @GetMapping("/fibers")
    public List<NetworkFiber> getFiberListByPosition(@RequestParam("swLng") double swLng,
                                                     @RequestParam("neLng") double neLng,
                                                     @RequestParam("swLat") double swLat,
                                                     @RequestParam("neLat") double neLat){
        List<NetworkFiber> fiberList = networkService.selectFiberListByPosition(swLng,neLng,swLat,neLat);
        if(fiberList.size() <= 10000){
            return fiberList;
        } else{
            List<NetworkFiber> resultList = new ArrayList<>();
            Set<Integer> randomNumSet = RandomUtil.generateRandomNums(fiberList.size() - 1, 10000);
            for(Integer index : randomNumSet){
                resultList.add(fiberList.get(index));
            }
            return resultList;
        }
    }

    @GetMapping("/fiber")
    public NetworkFiber getFiberByPosition(@RequestParam("lng") double lng,
                                           @RequestParam("lat") double lat){
        List<NetworkFiber> fiberList = networkService.selectFiberByPosition(lng,lat);
        if (fiberList != null && !fiberList.isEmpty()){
            return fiberList.get(0);
        }
        return null;
    }

    @GetMapping("/fibers/{aoiId}")
    public List<NetworkFiber> getFiberListByAOI(@PathVariable("aoiId") String aoiId){
        return networkService.selectFiberListByAOI(aoiId);
    }

}
