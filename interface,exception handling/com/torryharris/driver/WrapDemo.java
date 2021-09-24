package com.torryharris.driver;

import java.util.Scanner;

public class WrapDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        int a=Integer.parseInt(str1);
        float f=Float.parseFloat(str2);
        System.out.println(a*2);
        System.out.println(f*2);
    }
}
