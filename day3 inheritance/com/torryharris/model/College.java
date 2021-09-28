package com.torryharris.model;

public class College {
   private String name;
   int id;
   String place;

    public College(String name, int id, String place) {
        this.name = name;
        this.id = id;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    public void displayCollege()
    {
        System.out.println("CollgeName "+name);
        System.out.println("college id" +id);
        System.out.println("college place" +place);
    }
}
