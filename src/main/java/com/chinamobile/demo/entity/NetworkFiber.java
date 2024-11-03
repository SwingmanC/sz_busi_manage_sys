package com.chinamobile.demo.entity;

public class NetworkFiber {
    private Integer id;

    private String fiberName;

    private String address;

    private String longitude;

    private String latitude;

    private String aoiId;

    public NetworkFiber(Integer id, String fiberName, String address, String longitude, String latitude, String aoiId) {
        this.id = id;
        this.fiberName = fiberName;
        this.address = address;
        this.longitude = longitude;
        this.latitude = latitude;
        this.aoiId = aoiId;
    }

    public NetworkFiber() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFiberName() {
        return fiberName;
    }

    public void setFiberName(String fiberName) {
        this.fiberName = fiberName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getAoiId() {
        return aoiId;
    }

    public void setAoiId(String aoiId) {
        this.aoiId = aoiId;
    }
}