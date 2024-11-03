package com.chinamobile.demo.entity;

public class NetworkResource {
    private Integer id;

    private String district;

    private String resourceName;

    private String longitude;

    private String latitude;

    private String aoiId;

    public NetworkResource(Integer id, String district, String resourceName, String longitude, String latitude, String aoiId) {
        this.id = id;
        this.district = district;
        this.resourceName = resourceName;
        this.longitude = longitude;
        this.latitude = latitude;
        this.aoiId = aoiId;
    }

    public NetworkResource() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
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