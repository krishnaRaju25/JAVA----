package com.torryharris.model;

import java.util.Objects;

public class Car {
    int chassisno;
    String name;
    String fueltype;
    Float power;

    public Car(int chassisno, String name, String fueltype, Float power) {
        this.chassisno = chassisno;
       this.name = name;
        this.fueltype = fueltype;
        this.power = power;
    }

    public int getChassisno() {
        return chassisno;
    }

    public void setChassisno(int chassisno) {
        this.chassisno = chassisno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public Float getPower() {
        return power;
    }

    public void setPower(Float power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "chassisno=" + chassisno +
                ", Name='" + name + '\'' +
                ", fueltype='" + fueltype + '\'' +
                ", power=" + power +
                '}';
    }


}
