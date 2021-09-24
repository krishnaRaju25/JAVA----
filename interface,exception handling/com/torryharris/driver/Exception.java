package com.torryharris.driver;

import java.awt.*;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
      int a,b,c;
        Scanner sc=new Scanner(System.in);
        b=sc.nextInt();
        c=sc.nextInt();
        try{
            if(c==0){
                throw new ArithmeticException("Custom Message divided by zero");
            }else{
                a=b/c;
            }
        }catch(ArithmeticException ex){
            System.out.println("Exception caught");
            System.out.println(ex);
        }
        System.out.println("After if else");
    }
}
