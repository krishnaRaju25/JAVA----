package com.torryharris.driver;

import com.torryharris.Exception.InsufficientException;
import com.torryharris.Exception.WithdrawlException;
import com.torryharris.model.Person;

public class Demo {
    public static void main(String[] args)  {
        Person person=new Person("kishore",12000,50000);
        try{
            person.withdrawAmount(20000);
            person.withdrawAmount(10000);
            person.withdrawAmount(30000);
        } catch (InsufficientException e) {
            e.printStackTrace();
        } catch (WithdrawlException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally block Excutes");
        }

    }
}
