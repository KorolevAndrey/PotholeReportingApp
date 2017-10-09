package com.example.user.potholereportingapp;

/**
 * Created by user on 3/25/2017.
 */

public class Blog {

    private String title;
    private String image;
    private String desc;


    private String latitude;
    private String longitude;



    private String username;

    public Blog(){



    }

    public Blog(String title, String image, String desc) {
        this.title = title;
        this.image = image;
        this.desc = desc;
        this.latitude = latitude;
        this.longitude = longitude;

        this.username=username;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

}
