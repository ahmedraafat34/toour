package com.example.ahamed.tours;

public class Food {
    private String ShopName;
    private String Place;
    private int Number;
    private int Image;

public Food(String shopname , String place , int number , int image) {
    this.ShopName = shopname;
    this.Place = place;
    this.Number = number;
    this.Image = image;
}

public String getShopName(){
    return ShopName;
}
public String getPlace(){
    return Place;
}
public int getNumber(){
    return Number;
    }
    public int getImage(){
    return Image;
    }
        }