package com.torryharris.driver;

import com.torryharris.model.Branch;
import com.torryharris.model.College;
import com.torryharris.model.Student;

public class CollegeDemo {
    public static void main(String[] args) {
        //Branch branch=new Branch("KCE",252,"Coimbatore","EEE",124);
        //branch.displayBranch();
        //branch.displayCollege();
        Student student=new Student(":KCE COLLEGE",123," :coimbatore","EEE",1234,"ARUN",1);
                student.displayStudents();
                student.displayCollege();
                student.displayBranch();

    }
}
