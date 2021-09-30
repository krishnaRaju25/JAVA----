package com.torrryharris.driver;

import com.torrryharris.testing.StringTest;

public class ChangeStringDemo {
    public static void main(String[] args) {
        StringTest stringTest=new StringTest();
        System.out.println(stringTest.toCaptialLetter("they are working"));
        System.out.println(stringTest.toSmallLetter("HI EVERYONE"));
    }
}
