package com.torrryharris.model;

import java.io.Serializable;

public class Person implements Serializable,Comparable<Person>{
    private static final int serialversionUID=101;
    String name;
    int id;
    String occupation;
    String city;

    public Person() {
    }

    public Person(String name, int id, String occupation, String city) {
        this.name = name;
        this.id = id;
        this.occupation = occupation;
        this.city = city;
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

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", occupation='" + occupation + '\'' +
                ", city='" + city + '\'' +
                '}';
    }



    @Override
    public int compareTo(Person o) {
        return this.id-o.id;
    }
}
