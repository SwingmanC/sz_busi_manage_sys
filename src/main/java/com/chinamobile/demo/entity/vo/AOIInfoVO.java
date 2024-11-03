package com.chinamobile.demo.entity.vo;

public class AOIInfoVO {
    private String aoiName;
    private String address;
    private String centerLon;
    private String centerLat;
    private Integer area;
    private int cableNum;
    private int resourceNum;
    private int fiberNum;

    public AOIInfoVO() {
        this.cableNum = 0;
        this.resourceNum = 0;
        this.fiberNum = 0;
    }

    public String getAoiName() {
        return aoiName;
    }

    public void setAoiName(String aoiName) {
        this.aoiName = aoiName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCenterLon() {
        return centerLon;
    }

    public void setCenterLon(String centerLon) {
        this.centerLon = centerLon;
    }

    public String getCenterLat() {
        return centerLat;
    }

    public void setCenterLat(String centerLat) {
        this.centerLat = centerLat;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public int getCableNum() {
        return cableNum;
    }

    public void setCableNum(int cableNum) {
        this.cableNum = cableNum;
    }

    public int getResourceNum() {
        return resourceNum;
    }

    public void setResourceNum(int resourceNum) {
        this.resourceNum = resourceNum;
    }

    public int getFiberNum() {
        return fiberNum;
    }

    public void setFiberNum(int fiberNum) {
        this.fiberNum = fiberNum;
    }
}
