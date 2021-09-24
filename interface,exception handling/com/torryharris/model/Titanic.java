package com.torryharris.model;

public class Titanic implements Boat {
    @Override
    public void floating() {
        System.out.println("Boat is titatic");
    }

    @Override
    public void move() {
        System.out.println("moves in water");
    }
}
