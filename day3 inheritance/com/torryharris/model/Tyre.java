package com.torryharris.model;

public class Tyre {
    private String tyre_name;
    private int tyre_size;

    public Tyre(String tyre_name, int tyre_size) {
        this.tyre_name = tyre_name;
        this.tyre_size = tyre_size;
    }

    public String getTyre_name() {
        return tyre_name;
    }

    public void setTyre_name(String tyre_name) {
        this.tyre_name = tyre_name;
    }

    public int getTyre_size() {
        return tyre_size;
    }

    public void setTyre_size(int tyre_size) {
        this.tyre_size = tyre_size;
    }
}
