package com.example.ahamed.tours;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class trasnsport {
    private String TransNam;
    private String Transloc;
    private int Transimg;

    public trasnsport(String nam , String loc , int img){

        this.TransNam=nam;
        this.Transloc=loc;
        this.Transimg=img;
    }
   public String getTransNam(){return TransNam;}
    public String getTransloc(){return Transloc;}
    public int getTransimg(){return Transimg;}


}
