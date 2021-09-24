package com.torryharris.driver;

import com.torryharris.model.AirIndia;
import com.torryharris.model.Swift;
import com.torryharris.model.Titanic;

public class VechicleDemo {
    public static void main(String[] args) {
        Swift swift=new Swift();
        swift.changeGear();
        swift.move();

        Titanic titanic=new Titanic();
        titanic.floating();
        titanic.move();

        AirIndia plane=new AirIndia();
        plane.fly();
        plane.move();
    }
}
