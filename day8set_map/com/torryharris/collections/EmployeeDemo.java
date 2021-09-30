package com.torryharris.collections;

import com.torryharris.model.Employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1=new Employee(101,"varun","manager",1200);
        Employee e2=new Employee(102,"arun","Engineer",13000);
        Employee e3=new Employee(103,"mani","SSE",40000);
        Employee e4=new Employee(104,"manoj","Business",20000);
        HashMap<Integer,Employee> employeeHashMap=new HashMap<>();
        employeeHashMap.put(e1.getId(),e1);
        employeeHashMap.put(e2.getId(),e2);
        employeeHashMap.put(e3.getId(),e3);
        employeeHashMap.put(e4.getId(),e4);
        for (Map.Entry<Integer, Employee> i : employeeHashMap.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }

            }
}
