package com.torryharris.model;

import com.torryharris.Exception.BalanceException;
import com.torryharris.Exception.InvalidRequestException;

public class Hrdept {
    public void requestCl(Employee employee,int no_of_days) throws InvalidRequestException, BalanceException {
        if (no_of_days > 3) {

            throw new BalanceException("NO continous leave allowed "+ employee.getName());
        }
          else if (employee.getBalanceCl()<no_of_days) {
            throw new InvalidRequestException("INVALID DAY OPTION"+employee.getBalanceCl());
        }
               // System.out.println("THE TOTAL NUMBER OF CL LEAVE "+employee.getBalanceCl());

                employee.setBalanceCl(employee.getBalanceCl()-(no_of_days));
                System.out.println("Balance CL:"+employee.getBalanceCl());
                System.out.println("no.of.Remaining leave to taken:"+employee.getBalanceCl());


            }
}
