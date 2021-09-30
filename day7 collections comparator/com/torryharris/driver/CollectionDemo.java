package com.torryharris.driver;

import com.torryharris.model.Employee;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        ArrayList<String> str=new ArrayList<>();
        str.add("BALL");
        str.add("Bat");
        str.add("Cricket");
        str.remove(1);
        ArrayList<Float> fl=new ArrayList<>();
        fl.add(12.4f);
        fl.add(23.5f);
        //employee
        Employee e1=new Employee(101,"Arun","MANAGER",12000);
        Employee e2=new Employee(102,"Manoj","MANAGER",13000);
        Employee e3=new Employee(103,"Krishna","Manager",14000);
        ArrayList<Employee> employeeArrayList=new ArrayList<>();
        employeeArrayList.add(e1);
        employeeArrayList.add(e2);
        employeeArrayList.add(e3);
       // for(int i=0;i<employeeArrayList.size();i++)
         //{
           //  System.out.println(employeeArrayList.get(i));
         //}
        Iterator<Employee> employeeIterator=employeeArrayList.iterator();
        while(employeeIterator.hasNext()){
            System.out.println(employeeIterator.next());
        }

        System.out.println(al);
        System.out.println(str);
        System.out.println(fl);
        //System.out.println(emp);
    }
}
