package com.torryharris.driver;

import com.torryharris.Exception.BalanceException;
import com.torryharris.Exception.InvalidRequestException;
import com.torryharris.model.Employee;
import com.torryharris.model.Hrdept;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee=new Employee(121,"ram","manager",12000);
        Hrdept hr=new Hrdept();
        try{
            hr.requestCl(employee,3);
            hr.requestCl(employee,3);
            hr.requestCl(employee,6);

        } catch (InvalidRequestException | BalanceException ex) {
            System.out.println(ex);
        }


    }
}
