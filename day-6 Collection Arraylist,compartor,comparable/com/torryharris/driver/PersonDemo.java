package com.torryharris.driver;

import com.torryharris.model.Employee;
import com.torryharris.model.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1=new Person(123412341001l,"varun","Tamilnadu","Engineer");
        Person person2=new Person(123412341003l,"Manoj","Bangalore","Business");
        Person person3=new Person(123412341002l,"sunil","Delhi","engineer");
        Person person4=new Person(123412341005l,"vijay","Tamilnadu","engineer");
        ArrayList<Person> personArrayList=new ArrayList<>();
        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);

        personArrayList.add(person4);
        personArrayList.remove(person4);

        for(int i=0;i<personArrayList.size();i++)
        {
            System.out.println(personArrayList.get(i));
        }
        personArrayList.sort(null);
        System.out.println("----After Sorting-----");
        Iterator<Person> personIterator =personArrayList.iterator();
        while(personIterator.hasNext()){
            System.out.println(personIterator.next());
        }

    }
}
