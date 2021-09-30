package com.torryharris.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(10, "varun");
        hm.put(20, "sunil");
        hm.put(30, "manoj");
        hm.put(40, "arjun");

        for (Map.Entry<Integer, String> i : hm.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
        for(Integer l:hm.keySet())
        {
            System.out.println(l+" = "+hm.get(l));
        }
    }
}
