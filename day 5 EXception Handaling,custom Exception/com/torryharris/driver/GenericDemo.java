package com.torryharris.driver;

import com.torryharris.model.Employee;
import com.torryharris.model.Generic;

public class GenericDemo {



    public static void main(String[] args) {
        Generic<Integer,Integer> gi=new Generic<>(10,10);
        System.out.println(gi.getObj());
        System.out.println(gi.getObj1());

        Generic<String,Float> gstr=new Generic<>("HI",231.f);
        System.out.println(gstr.getObj());
        System.out.println(gstr.getObj1());
        Employee e1=new Employee(121,"Varun","Manager",11000);
        Generic<Employee, Double> employee=new Generic<>(e1,2333.55);

        System.out.println(employee.getObj());
        System.out.println(employee.getObj1());
        Employee emp=new Employee(11,"Varun","HOD",12000);
         //  genericDisplay(10);

       // static <T> void genericDisplay(T obj)

    }
}
