package com.torryharris.model;

public class Person implements Comparable<Person>{
    int id;
    String name;
    String occupation;
    String city;

    public Person() {
    }

    public Person(int id, String name, String occupation, String city) {
        this.id = id;
        this.name = name;
        this.occupation = occupation;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.id-o.id;
    }
}
