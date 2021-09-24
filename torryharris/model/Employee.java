package com.torryharris.model;
public class Employee {
    private String name;
    private int employeeid;
    private String designation;
    private float salary;

    public Employee() {
    }

    public Employee(String name, int employeeid, String designation, float salary) {
        this.name = name;
        this.employeeid = employeeid;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    public void displayFeature()
    {
        System.out.println("Employee name :"+name);
        System.out.println("Employee id :"+employeeid);
        System.out.println("designation :"+designation);
        System.out.println("salary:"+salary);
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", employeeid=" + employeeid +
                ", designation='" + designation + '\'' +
                ", salary=" + salary   +"  "
                ;
    }
}
