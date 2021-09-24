package com.torryharris.model;

public class Car {
    private  String name;
    private String fuelType;
    private int engineType;
        private float power;
        private int changeGear;
        private Tyre tyre;
        private Entertainment entertainment;

    public Car() {
    }

    public Car(String name, String fuelType, int engineType, float power, int changeGear,Tyre tyre,
               Entertainment entertainment) {
        this.name = name;
        this.fuelType = fuelType;
        this.engineType = engineType;
        this.power = power;
        this.changeGear=changeGear;
        this.tyre=tyre;
        this.entertainment=entertainment;

}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChangeGear() {
        return changeGear;
    }

    public void setChangeGear(int changeGear) {
        this.changeGear = changeGear;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getEngineType() {
        return engineType;
    }

    public void setEngineType(int engineType) {
        this.engineType = engineType;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public Tyre getTyre() {
        return tyre;
    }
    public void setTyre(Tyre tyre) {
       this.tyre=tyre;
    }

    public Entertainment getEntertainment() {
        return entertainment;
    }

    public void setEntertainment(Entertainment entertainment) {
        this.entertainment = entertainment;
    }

    public void carAcceleration()
    {
        System.out.println(name+" good acceleration");
    }
    public void applyBreak()
    {
        System.out.println(name+" good breaking");
    }
    public void changeGear()
    {
        System.out.println(name+" good gearing");
    }
    public void steer()
    {
        System.out.println(name+" good steering control");
    }
    public void changeGearing() {
        if (changeGear > 0) {
            System.out.println(changeGear + 1);

        }
    }



    public void displayFeature()
    {
        System.out.println("car name :"+name);
        System.out.println("fuel type :"+fuelType);
        System.out.println("engine cc :"+engineType);
        System.out.println("horse power :"+power);
        System.out.println("no of gears :"+changeGear);
        System.out.println("tyre name :"+tyre.getTyre_name());
        System.out.println("tyre size :"+tyre.getTyre_size());
        System.out.println("entertainment name :"+entertainment.getEnname());
        System.out.println("entertainment woofer :"+entertainment.getWoofer());
        System.out.println("entertainment subwoofer :"+entertainment.isSubwoofer());
        System.out.println("entertainment screensize :"+entertainment.getLcdsize());


    }



}



