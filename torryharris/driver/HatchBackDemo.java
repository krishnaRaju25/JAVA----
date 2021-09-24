package com.torryharris.driver;

import com.torryharris.model.*;

public class HatchBackDemo {
    public static void main(String[] args) {
        Tyre t1=new Tyre("MRF",19);
        Entertainment e1=new Entertainment("sony",20,true,6);

        Sedan dzire=new Sedan("Dzire","petrol",1000,80.7f,
                6,t1,e1,8);
        dzire.displaySedanFeatures();

        Suv innova=new Suv("INNOVAcrysta","petrol",2000,120.3f,
                7,t1,e1,"sports",true);
        innova.displaySuvFeature();

    }
}
