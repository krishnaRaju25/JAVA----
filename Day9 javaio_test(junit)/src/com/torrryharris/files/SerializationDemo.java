package com.torrryharris.files;

import com.torrryharris.model.Employee;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) throws IOException {
        Employee e1=new Employee(123,"Arun","Developer",12000d);
        Employee e2=new Employee(124,"Varun","engineer",13000d);
        Employee e3=new Employee(125,"praveen","sse",15000d);
        FileOutputStream outputStream=new FileOutputStream("fileOutput.txt");
        ObjectOutputStream outputStream1=new ObjectOutputStream(outputStream);
        outputStream1.writeObject(e1);
        outputStream1.writeObject(e2);
        outputStream1.writeObject(e3);
        outputStream1.flush();
        outputStream1.close();
        outputStream.close();
    }
}
