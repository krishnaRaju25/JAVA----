package com.torryharris.model;

public abstract class Shape {
    private int noOfsides;
    abstract public  void area();

    public int getNoOfsides() {
        return noOfsides;
    }

    public void setNoOfsides(int noOfsides) {
        this.noOfsides = noOfsides;
    }
}
