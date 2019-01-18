package com.example.ahamed.tours;

public class Night {

    private String PlacName;
    private String Location;
    public int pic;

    public Night(String placname , String loc , int picture){
        this.PlacName=placname;
        this.Location=loc;
        this.pic=picture;
    }

    public String getPlacName(){
        return PlacName;
    }
    public String getLocation(){
        return Location;
    }
    public int getPic(){return pic;}
}
