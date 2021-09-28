package com.torryharris.driver;

import com.torryharris.model.Clerk;
import com.torryharris.model.Employee;
import com.torryharris.model.Lead;
import com.torryharris.model.Manager;

public class EmployeeDemo {
    public static void main(String[] args) {

        Manager m1=new Manager("ashok",123,"manager",12000.3f,"java",5);


        Lead l1=new Lead("prakash",121,"lead",10000.00f,5);


        Clerk c1=new Clerk("mano",123,"clerk",12000.0f,"bcom");
        System.out.println(m1);
        m1.displayCallMeeting();

        System.out.println(l1);
        l1.displayStandUpcall();

        System.out.println(c1);

    }
}
