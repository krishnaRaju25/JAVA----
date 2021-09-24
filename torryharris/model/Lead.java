package com.torryharris.model;

public class Lead extends Employee{
    int teamsize;

    public Lead(String name, int employeeid, String designation, float salary, int teamsize) {
        super(name, employeeid, designation, salary);
        this.teamsize = teamsize;
    }

    public int getTeamsize() {
        return teamsize;
    }

    public void setTeamsize(int teamsize) {
        this.teamsize = teamsize;
    }

    @Override
    public String toString() {
        System.out.println("lead");
        return "Lead{" +super.toString() +
                "teamsize=" + teamsize +
                '}';
    }
    public void displayStandUpcall(){
        System.out.println("standupcall lead");
    }
}
