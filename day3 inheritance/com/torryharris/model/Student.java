package com.torryharris.model;

public class Student extends Branch{
    private String studentName;
    private int studentno;

    public Student(String name, int id, String place, String branchName, int branchId, String studentName, int studentno) {
        super(name, id, place, branchName, branchId);
        this.studentName = studentName;
        this.studentno = studentno;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentno() {
        return studentno;
    }

    public void setStudentno(int studentno) {
        this.studentno = studentno;
    }
    public void displayStudents()
    {
        System.out.println("Student name:"+studentName);
        System.out.println("Student no:"+studentno);
    }
}
