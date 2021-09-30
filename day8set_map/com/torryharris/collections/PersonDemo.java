package com.torryharris.collections;

import com.torryharris.Comparator.CityComparator;
import com.torryharris.model.Person;

import java.util.TreeSet;

public class PersonDemo {
    public static void main(String[] args) {
        Person p1=new Person(103,"arun","Engineer","coimbatore");
        Person p2=new Person(101,"manoj","SSE","Bangalore");
        Person p3=new Person(102,"karthi","Business","chennai");
        Person p4=new Person(105,"sachin","cricketer","mumbai");
        Person p5=new Person(104,"ronaldo","footballer","portugal");
        TreeSet<Person> personTreeSet=new TreeSet<>();
        personTreeSet.add(p1);
        personTreeSet.add(p2);
        personTreeSet.add(p3);
        personTreeSet.add(p4);
        personTreeSet.add(p5);

        for(Person person:personTreeSet)
        {
            System.out.println(person);
        }
        personTreeSet.remove(p3);
        System.out.println();
        for(Person person:personTreeSet)
        {
            System.out.println(person);
        }

        System.out.println("City sort");
        TreeSet<Person> personTreeSet1=new TreeSet<>(new CityComparator());
        personTreeSet1.add(p1);
        personTreeSet1.add(p2);
        personTreeSet1.add(p3);
        personTreeSet1.add(p4);
        personTreeSet1.add(p5);

        for(Person city:personTreeSet1){
            System.out.println(city);
        }

    }
}
