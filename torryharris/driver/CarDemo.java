package com.torryharris.driver;

import com.torryharris.model.Car;
import com.torryharris.model.Entertainment;
import com.torryharris.model.Tyre;

class CarDemo {
    public static void main(String[] args) {
        Tyre t1=new Tyre("MRF",19);
       // Tyre t2=new Tyre("Apollo",18);

        Entertainment e1=new Entertainment("bolt",4,true,12);
      //  Entertainment e2=new Entertainment("skullcandy",6,true,8);

        Car c1=new Car("nexon","petrol",1200, 111.11f,5,t1,e1);


         c1.displayFeature();
        System.out.println("CAR 2");

    }
}
