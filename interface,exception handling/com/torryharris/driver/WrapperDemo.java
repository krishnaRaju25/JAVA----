package com.torryharris.driver;

public class WrapperDemo {
    public static void main(String[] args) {
        int a=10;
        Integer aobj=a;  //boxing primitive (int) to object (Integer)
         int aa=aobj;      //unboxing

        int a1=20;
        Integer a1obj=a1; //boxing
        int a11=a1obj;// unboxing

        System.out.println("sum  "+ (aa+a11));
        System.out.println("difference "+(aa - a11));
        System.out.println("multiply "+(aa*a11));
        System.out.println("Division "+(aa/a11));

    }
}
