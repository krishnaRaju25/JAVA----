package com.torryharris.model;

public class AirIndia implements Airplane{
    @Override
    public void fly() {
        System.out.println("Flys Faster");
    }

    @Override
    public void move() {
        System.out.println("Moves in air");
    }
}
