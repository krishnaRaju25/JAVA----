package com.torryharris.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> inths=new HashSet<>();
        inths.add(12);
        inths.add(18);
        inths.add(12);
        inths.add(14);
        System.out.println(inths);
        HashSet<String> hs=new HashSet<>();
        hs.add("one");
        hs.add("two");
        hs.add("three");
        System.out.println(hs);
        System.out.println(hs.contains("two"));
        HashSet<Double> hs1=new HashSet<>();
        hs1.add(10.19d);
        hs1.add(12.14d);
        hs1.add(14.15d);
        hs1.add(17.12d);
        System.out.println(hs1);
        hs1.remove(12.14d);
        System.out.println(hs1);
        System.out.println(Collections.max(hs1));

    }
}
