package com.torrryharris.files;

import java.io.*;
import java.nio.CharBuffer;
import java.util.Scanner;

public class NameDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        String names=sc.nextLine();
        int number=sc.nextInt();

        FileWriter fileWriter=new FileWriter("input2.txt");
        for(int i=0;i<number;i++)
        {
            fileWriter.write(names);
            System.out.println( );

        }
        fileWriter.close();

    }
}
