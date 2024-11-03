package com.chinamobile.demo.entity;

public class NetworkCable {
    private Integer id;

    private String district;

    private String cableName;

    private String type;

    private String longitude;

    private String latitude;

    public NetworkCable(Integer id, String district, String cableName, String type, String longitude, String latitude) {
        this.id = id;
        this.district = district;
        this.cableName = cableName;
        this.type = type;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public NetworkCable() {
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

    public String getCableName() {
        return cableName;
    }

    public void setCableName(String cableName) {
        this.cableName = cableName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
}