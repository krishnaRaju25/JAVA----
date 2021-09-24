package com.torryharris.model;

public class Swift implements Car{
    @Override
    public void changeGear() {
        System.out.println("Changing Gears");
    }

    @Override
    public void move() {
        System.out.println("Moving Fast");
    }
}
