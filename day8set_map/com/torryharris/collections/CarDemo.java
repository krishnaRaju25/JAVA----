package com.torryharris.collections;

import com.torryharris.Comparator.PowerComparator;
import com.torryharris.model.Car;

import java.lang.reflect.Array;
import java.util.*;

public class CarDemo {
    public static void main(String[] args) {
        Car c1=new Car(1236,"Swift","Petrol",59.6f);
        Car c2=new Car(1238,"Swift","Diesel",55.5f);
        Car c3=new Car(1234,"Nexon","diesel",50.8f);
        Car c4=new Car(1235,"tesla","electric",57.2f);
        ArrayList<Car> carArrayList=new ArrayList<>();
        carArrayList.add(c1);
        carArrayList.add(c2);
        carArrayList.add(c3);
        carArrayList.add(c4);
        for(Car c:carArrayList)
        {
            System.out.println(c);
        }
       TreeSet<Car> carTreeSet=new TreeSet<>(new PowerComparator());
         carTreeSet.add(c1);
        carTreeSet.add(c2);
        carTreeSet.add(c3);
        carTreeSet.add(c4);


        System.out.println("___SORTING BY CAR POWER_____");
        for(Car c:carTreeSet)
        {
            System.out.println(c);
        }

        HashMap<String,Car> CarHashMap=new HashMap<>();
        CarHashMap.put(c1.getName(),c1);
        CarHashMap.put(c2.getName(),c2);
        CarHashMap.put(c3.getName(),c3);
        CarHashMap.put(c4.getName(),c4);

        System.out.println("----UNIQUE CAR NAMES---");
        for(Map.Entry<String,Car> i:CarHashMap.entrySet())
        {
            System.out.println(i.getKey()+" "+i.getValue());
        }
    }
}
