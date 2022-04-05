package com.example.lab_work_smd_section_bscs_6c.task3CityList;

public class task3CityClass {
        String City,Visitors,Likes;

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getVisitors() {
        return Visitors;
    }

    public void setVisitors(String visitors) {
        Visitors = visitors;
    }

    public String getLikes() {
        return Likes;
    }

    public void setLikes(String likes) {
        Likes = likes;
    }

    public task3CityClass(String city, String likes, String visitors) {
        City = city;
        Likes = likes;
        Visitors = visitors;
    }
    public task3CityClass() {
    }
}
