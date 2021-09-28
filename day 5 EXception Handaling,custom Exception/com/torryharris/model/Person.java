package com.torryharris.model;

import com.torryharris.Exception.InsufficientException;
import com.torryharris.Exception.WithdrawlException;

public class Person {
   private String name;
   private int accountnumber;
   private int balance;
   private int totalamountWithdrawn;
   int DAILY_AMOUNT_LIMIT=40000;
    public Person(String name, int accountnumber, int balance) {
        this.name = name;
        this.accountnumber = accountnumber;
        this.balance = balance;
        this.totalamountWithdrawn=0;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getTotalamountWithdrawn() {
        return totalamountWithdrawn;
    }

    public void setTotalamountWithdrawn(int totalamountWithdrawn) {
        this.totalamountWithdrawn = totalamountWithdrawn;
    }

    public void withdrawAmount(int amount) throws WithdrawlException, InsufficientException {
        if(amount>balance) {
            throw new InsufficientException("Insufficient fund Check Balance");
        }
        if(totalamountWithdrawn+amount> DAILY_AMOUNT_LIMIT){
            throw new WithdrawlException("withdrawl limit exceed:\n"+
                    "Total amount withdrawl today is " +totalamountWithdrawn);
        }
        balance=balance-amount;
        totalamountWithdrawn+=amount;
        System.out.println("amount withdrawl for rs:"+amount+" is success");
        System.out.println("Balance is rs "+balance);
        System.out.println("Total amount withdrawn today"+totalamountWithdrawn);
    }


}
