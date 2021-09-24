package com.torryharris.driver;

import com.torryharris.model.Bat;
import com.torryharris.model.Cow;
import com.torryharris.model.Mammal;
import com.torryharris.model.Tiger;

public class MammalDemo {
    public static void main(String[] args) {
        Mammal cow=new Cow();
        Mammal tiger=new Tiger();
        Bat bat=new Bat();
        cow.feed();
        tiger.feed();
        bat.feed();
        bat.fly();
    }
}
