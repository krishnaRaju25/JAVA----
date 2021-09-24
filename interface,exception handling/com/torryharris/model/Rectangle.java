package com.torryharris.model;

public class Rectangle extends Shape{
    private int heigth;
    private int length;

    public Rectangle(int heigth, int length) {
        this.heigth = heigth;
        this.length = length;
        setNoOfsides(4);
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void area() {
        System.out.println("REctangle "+(length*heigth));
    }
}
