package com.torryharris.collections;

import com.torryharris.model.Person;

import java.util.HashSet;

public class PersonHashSetDemo {
    public static void main(String[] args) {
        Person p1=new Person(103,"arun","Engineer","coimbatore");
        Person p2=new Person(101,"manoj","SSE","Bangalore");
        Person p3=new Person(102,"karthi","Business","chennai");
        Person p4=new Person(105,"sachin","cricketer","mumbai");
        Person p5=new Person(104,"ronaldo","footballer","portugal");
        HashSet<Person> personHashSet=new HashSet<>();
      personHashSet.add(p1);
      personHashSet.add(p2);
      personHashSet.add(p3);
      personHashSet.add(p4);
      personHashSet.add(p5);
      for(Person person:personHashSet)
      {
          System.out.println(person);
      }
    }
}
