package com.torryharris.Comparator;

import com.torryharris.model.Car;

import java.util.Comparator;

public class PowerComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getPower().compareTo(o2.getPower());
    }
}
