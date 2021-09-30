package com.torryharris.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> stringLinkedHashSet=new LinkedHashSet<>();
        stringLinkedHashSet.add("ajay");
        stringLinkedHashSet.add("Rahul");
        stringLinkedHashSet.add("Gokul");
        stringLinkedHashSet.add("pavi");
        System.out.println(stringLinkedHashSet);
    }
}
