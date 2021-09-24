package com.torryharris.model;

public class Sedan extends Car{
    int bootspace;

    public Sedan(String name, String fuelType, int engineType, float power, int changeGear, Tyre tyre, Entertainment entertainment, int bootspace) {
        super(name, fuelType, engineType, power, changeGear, tyre, entertainment);
        this.bootspace = bootspace;
    }
    public void displaySedanFeatures()
    {
        displayFeature();
        System.out.println(bootspace);
    }

    public int getBootspace() {
        return bootspace;
    }

    public void setBootspace(int bootspace) {
        this.bootspace = bootspace;
    }
}
