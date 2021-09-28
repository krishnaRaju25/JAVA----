package com.torryharris.driver;

import com.torryharris.comparator.CollectionSort;
import com.torryharris.comparator.ImbdComparator;
import com.torryharris.comparator.YearComparator;
import com.torryharris.model.Movie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MovieDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Movie m1 = new Movie("theri", 2018, 8.8f, 10000.00f);
        Movie m2 = new Movie("master", 2020, 9.8f, 20000.00f);
        Movie m3 = new Movie("valimai", 2021, 4.8f, 60000.00f);
        ArrayList<Movie> movieArrayList = new ArrayList<>();
        movieArrayList.add(m1);
        movieArrayList.add(m2);
        movieArrayList.add(m3);

        movieArrayList.sort(null);
        Iterator<Movie> movieIterator = movieArrayList.iterator();
        switch (n) {
            case 1:
                System.out.println("TITLE SORT____");

                while (movieIterator.hasNext()) {
                    System.out.println(movieIterator.next());
                }

                break;
            case 2:
                movieArrayList.sort(new YearComparator());
                movieIterator = movieArrayList.iterator();

                System.out.println("DATE SORT____");

                while (movieIterator.hasNext()) {
                    System.out.println(movieIterator.next());
                }
                break;
            case 3:
                System.out.println(" COLLECTION SORT____");
                movieArrayList.sort(new ImbdComparator());
                movieIterator = movieArrayList.iterator();
                while (movieIterator.hasNext()) {
                    System.out.println(movieIterator.next());
                }

                break;
            case 4:

                movieArrayList.sort(new CollectionSort());
                System.out.println(" IMBD SORT____");
                movieIterator = movieArrayList.iterator();
                while (movieIterator.hasNext()) {
                    System.out.println(movieIterator.next());
                }
                break;
            default:
                System.out.println("NO PROPER SELECTION");
        }

    }

}