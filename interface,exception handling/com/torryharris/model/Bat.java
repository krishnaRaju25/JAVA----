package com.torryharris.model;

public class Bat implements Mammal,Bird{

    @Override
    public void fly() {
        System.out.println("Bat flys faster");
    }

    @Override
    public void feed() {
        System.out.println("Bat is feeding");
    }


}
