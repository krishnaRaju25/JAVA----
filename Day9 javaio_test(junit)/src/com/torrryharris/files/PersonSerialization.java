package com.torrryharris.files;

import com.torrryharris.model.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonSerialization {
    public static void main(String[] args) throws IOException {
        Person p1=new Person("Arun",107,"Engineer","Coimbatore");
        Person p2=new Person("manoj",103,"SSE","Bangalore");
        Person p3=new Person("karthi",102,"Manager","delhi");
        FileOutputStream fos=new FileOutputStream("person.txt");
        ObjectOutputStream outputStream=new ObjectOutputStream(fos);
        outputStream.writeObject(p1);
        outputStream.writeObject(p2);
        outputStream.writeObject(p3);
        outputStream.close();
  fos.close();

    }
}
