package com.torryharris.driver;

import com.torryharris.model.Bird;
import com.torryharris.model.Peacock;
import com.torryharris.model.Piegon;

public class BirdDemo {
    public static void main(String[] args) {
        Bird peacock=new Peacock();
        Bird piegon=new Piegon();

        peacock.fly();

        piegon.fly();
    }
}
