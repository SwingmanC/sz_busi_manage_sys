package com.chinamobile.demo.entity;

public class AMapAOIBorder {
    private String aoiId;

    private String eastLng;

    private String westLng;

    private String northLat;

    private String southLat;

    private String polygon;

    public AMapAOIBorder(String aoiId, String eastLng, String westLng, String northLat, String southLat) {
        this.aoiId = aoiId;
        this.eastLng = eastLng;
        this.westLng = westLng;
        this.northLat = northLat;
        this.southLat = southLat;
    }

    public AMapAOIBorder(String aoiId, String eastLng, String westLng, String northLat, String southLat, String polygon) {
        this.aoiId = aoiId;
        this.eastLng = eastLng;
        this.westLng = westLng;
        this.northLat = northLat;
        this.southLat = southLat;
        this.polygon = polygon;
    }

    public AMapAOIBorder() {
        super();
    }

    public String getAoiId() {
        return aoiId;
    }

    public void setAoiId(String aoiId) {
        this.aoiId = aoiId;
    }

    public String getEastLng() {
        return eastLng;
    }

    public void setEastLng(String eastLng) {
        this.eastLng = eastLng;
    }

    public String getWestLng() {
        return westLng;
    }

    public void setWestLng(String westLng) {
        this.westLng = westLng;
    }

    public String getNorthLat() {
        return northLat;
    }

    public void setNorthLat(String northLat) {
        this.northLat = northLat;
    }

    public String getSouthLat() {
        return southLat;
    }

    public void setSouthLat(String southLat) {
        this.southLat = southLat;
    }

    public String getPolygon() {
        return polygon;
    }

    public void setPolygon(String polygon) {
        this.polygon = polygon;
    }
}