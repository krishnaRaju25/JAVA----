package com.torrryharris.files;

import java.io.*;

public class FileReaderWriterDemo {
    public static void main(String[] args) throws IOException {
        File input=new File("input.txt");
        FileReader fileReader=new FileReader(input);
        char[] array=new char[(int)input.length()];
        fileReader.read(array);
        String str=new String(array);
        System.out.println(str);
        fileReader.close();

        str="this is the content of the file using fileWriter";
        FileWriter fileWriter=new FileWriter("output2.txt");
        fileWriter.write(str);
        fileWriter.close();
    }
}
