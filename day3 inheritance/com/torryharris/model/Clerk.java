package com.torryharris.model;

public class Clerk extends Employee{
    String degree;

    public Clerk(String name, int employeeid, String designation, float salary, String degree) {
        super(name, employeeid, designation, salary);
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        System.out.println("clerk");
        return "Clerk{" +super.toString()+
                "degree='" + degree + '\'' +
                '}';
    }
}
