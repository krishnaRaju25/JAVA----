package com.torryharris.model;

public class Employee {
    private int eid;
    private String name;
    private String designation;
    private int salary;
   private int balanceCl;

    public Employee(int eid, String name, String designation, int salary) {
        this.eid = eid;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
      this.balanceCl=12;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public int getBalanceCl() {
        return balanceCl;
    }

    public void setBalanceCl(int balanceCl) {
        this.balanceCl = balanceCl;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", balanceCl=" + balanceCl +
                '}';
    }
}
