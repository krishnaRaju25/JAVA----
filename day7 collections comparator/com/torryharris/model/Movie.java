package com.torryharris.model;

public class Movie implements Comparable<Movie> {
    String title;
    int year;
    Float imdrating;
    Float collection;

    public Movie(String title, int year, Float imdrating, Float collection) {
        this.title = title;
        this.year = year;
        this.imdrating = imdrating;
        this.collection = collection;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Float getImdrating() {
        return imdrating;
    }

    public void setImdrating(Float imdrating) {
        this.imdrating = imdrating;
    }

    public Float getCollection() {
        return collection;
    }

    public void setCollection(Float collection) {
        this.collection = collection;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", imdrating=" + imdrating +
                ", collection=" + collection +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        return this.title.compareTo(o.title);
    }
}
