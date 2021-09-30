package com.torryharris.collections;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> integerTreeSet=new TreeSet<>();
        integerTreeSet.add(10);
        integerTreeSet.add(1);
        integerTreeSet.add(3);
        integerTreeSet.add(2);
        TreeSet<String> stringTreeSet=new TreeSet<>();
        stringTreeSet.add("manoj");
        stringTreeSet.add("bala");
        stringTreeSet.add("arun");
        TreeSet<Float> floats=new TreeSet<>();
        floats.add(12.05f);
        floats.add(11.05f);
        floats.add(10.99f);
        System.out.println(integerTreeSet);
        System.out.println(stringTreeSet);
        System.out.println(floats);
    }
}
