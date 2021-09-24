package com.torryharris.model;

public class Manager extends Employee{
    String projectname;
    int no_of_teams;

    public Manager(String name, int employeeid, String designation, float salary, String projectname, int no_of_teams) {
        super(name, employeeid, designation, salary);
        this.projectname = projectname;
        this.no_of_teams = no_of_teams;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public int getNo_of_teams() {
        return no_of_teams;
    }

    public void setNo_of_teams(int no_of_teams) {
        this.no_of_teams = no_of_teams;
    }

    @Override
    public String toString() {

        return "Manager{" +super.toString()+
                "projectname='" + projectname + '\'' +
                ", no_of_teams=" + no_of_teams +
                '}';
    }
    public void displayCallMeeting(){
        System.out.println("Manager calls for meeting");
    }
}
