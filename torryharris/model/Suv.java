package com.torryharris.model;

public class Suv extends Car{
    String drivemode;
    boolean sunroof;

    public Suv(String name, String fuelType, int engineType, float power, int changeGear, Tyre tyre, Entertainment entertainment, String drivemode, boolean sunroof) {
        super(name, fuelType, engineType, power, changeGear, tyre, entertainment);
        this.drivemode = drivemode;
        this.sunroof = sunroof;
    }
    public void displaySuvFeature(){
        displayFeature();
        System.out.println(drivemode);
        System.out.println(sunroof);
    }
}
