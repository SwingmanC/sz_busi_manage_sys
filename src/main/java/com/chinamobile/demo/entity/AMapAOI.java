package com.chinamobile.demo.entity;

public class AMapAOI {
    private String aoiId;

    private String aoiName;

    private String address;

    private String centerLon;

    private String centerLat;

    private Integer area;

    private String type1;

    private String type2;

    private String type3;

    private String town;

    private String county;

    public AMapAOI(String aoiId, String aoiName, String address, String centerLon, String centerLat, Integer area, String type1, String type2, String type3, String town, String county) {
        this.aoiId = aoiId;
        this.aoiName = aoiName;
        this.address = address;
        this.centerLon = centerLon;
        this.centerLat = centerLat;
        this.area = area;
        this.type1 = type1;
        this.type2 = type2;
        this.type3 = type3;
        this.town = town;
        this.county = county;
    }

    public AMapAOI() {
        super();
    }

    public String getAoiId() {
        return aoiId;
    }

    public void setAoiId(String aoiId) {
        this.aoiId = aoiId;
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

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getType3() {
        return type3;
    }

    public void setType3(String type3) {
        this.type3 = type3;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
}