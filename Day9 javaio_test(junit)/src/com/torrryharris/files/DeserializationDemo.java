package com.torrryharris.files;

import com.torrryharris.model.Employee;

import java.io.*;
import java.util.ArrayList;

public class DeserializationDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("fileOutput.txt");
        ObjectInputStream inputStream=new ObjectInputStream(fis);
        ArrayList<Employee> employeeArrayList=new ArrayList<>();
        Employee employee;
        try
        {
            while(true)
            {
                employee=(Employee)inputStream.readObject();
                employeeArrayList.add(employee);
            }

        }
        catch(EOFException | ClassNotFoundException ex){

        }
        for(Employee emp:employeeArrayList)
        {
            System.out.println(emp);
        }
    }
}
