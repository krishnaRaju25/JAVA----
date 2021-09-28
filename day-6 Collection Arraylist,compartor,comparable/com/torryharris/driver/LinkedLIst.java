package com.torryharris.driver;

import java.util.LinkedList;

public class LinkedLIst {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("varun");
        list.add("praveen");
        list.add("rohit");
        list.add("samson");
        for(String str:list)
        {
            System.out.println(str);
        }
    }
}
