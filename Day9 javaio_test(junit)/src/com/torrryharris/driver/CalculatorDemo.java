package com.torrryharris.driver;

import com.torrryharris.testing.Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println("add"+calculator.add(2,3));
        System.out.println("Sub"+calculator.sub(4,10));

    }
}
