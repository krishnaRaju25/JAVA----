package com.torrryharris.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStrem {
    public static void main(String[] args) throws IOException {
        FileInputStream file=new FileInputStream("input.txt");
        System.out.println("File contents are");
        int ch;
        while((ch=file.read())!=-1)
        {
            System.out.print((char) ch);
        }
        file.close();
        FileOutputStream fos=new FileOutputStream("output.txt");
        String str="THis is a output file \n contains data from output ";
        char[] ch1=str.toCharArray();
        for(char c:ch1)
        {
            fos.write((int)c);
        }
        System.out.println("output file created Successfully!!!");
        fos.close();
    }
}
