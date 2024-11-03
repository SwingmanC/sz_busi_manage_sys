package com.chinamobile.demo.entity;

public class NetworkWireless {
    private Integer id;

    private String grid;

    private String wirelessId;

    private String wirelessName;

    private String wirelessFullName;

    private Integer floor;

    private String longitude;

    private String latitude;

    private String aoiId;

    public NetworkWireless(Integer id, String grid, String wirelessId, String wirelessName, String wirelessFullName, Integer floor, String longitude, String latitude, String aoiId) {
        this.id = id;
        this.grid = grid;
        this.wirelessId = wirelessId;
        this.wirelessName = wirelessName;
        this.wirelessFullName = wirelessFullName;
        this.floor = floor;
        this.longitude = longitude;
        this.latitude = latitude;
        this.aoiId = aoiId;
    }

    public NetworkWireless() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGrid() {
        return grid;
    }

    public void setGrid(String grid) {
        this.grid = grid;
    }

    public String getWirelessId() {
        return wirelessId;
    }

    public void setWirelessId(String wirelessId) {
        this.wirelessId = wirelessId;
    }

    public String getWirelessName() {
        return wirelessName;
    }

    public void setWirelessName(String wirelessName) {
        this.wirelessName = wirelessName;
    }

    public String getWirelessFullName() {
        return wirelessFullName;
    }

    public void setWirelessFullName(String wirelessFullName) {
        this.wirelessFullName = wirelessFullName;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
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