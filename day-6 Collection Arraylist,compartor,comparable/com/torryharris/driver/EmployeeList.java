package com.torryharris.driver;

import com.torryharris.comparator.EmployeeNameComparator;
import com.torryharris.model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class EmployeeList {
    public static void main(String[] args) {
        Employee e1 = new Employee(102, "Arun", "MANAGER", 12000);
        Employee e2 = new Employee(101, "Manoj", "MANAGER", 13000);
        Employee e3 = new Employee(104, "Krishna", "Manager", 14000);
        Employee e4 = new Employee(103, "gokul", "SSE", 15000);
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(e1);
        employeeArrayList.add(e2);
        employeeArrayList.add(e3);
        employeeArrayList.add(e4);

        Iterator<Employee> employeeIterator = employeeArrayList.iterator();
        while (employeeIterator.hasNext()) {
            System.out.println(employeeIterator.next());
        }

        employeeArrayList.sort(null);
        System.out.println("------After Sorting----");
        Iterator<Employee> employeeIterator1 = employeeArrayList.iterator();
        while (employeeIterator1.hasNext()) {
            System.out.println(employeeIterator1.next());
        }

        System.out.println("------After NAME SORTING----");
        employeeArrayList.sort(new EmployeeNameComparator()) ;
            employeeIterator=employeeArrayList.iterator();
            while(employeeIterator.hasNext())
            {
                System.out.println(employeeIterator.next());
            }

    }
}
