package com.torryharris.comparator;

import com.torryharris.model.Movie;

import java.util.Comparator;

public class CollectionSort implements Comparator<Movie> {


    @Override
    public int compare(Movie o1, Movie o2) {
        return o2.getCollection().compareTo(o1.getCollection());
    }
}
