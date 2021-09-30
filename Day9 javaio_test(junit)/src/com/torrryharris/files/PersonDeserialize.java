package com.torrryharris.files;

import com.torrryharris.model.Employee;
import com.torrryharris.model.Person;

import java.io.*;
import java.util.ArrayList;

public class PersonDeserialize {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("person.txt");
        ObjectInputStream inputStream=new ObjectInputStream(fis);
        ArrayList<Person> personArrayList=new ArrayList<>();
        Person person;
        try
        {
            while(true)
            {
                person=(Person)inputStream.readObject();
                personArrayList.add(person);
            }

        }
        catch(EOFException | ClassNotFoundException ex){

        }
        System.out.println("READING OBJECT FROM FILE____");
        for(Person per:personArrayList)
        {
            System.out.println(per);
        }
        personArrayList.sort(null);
        System.out.println("After Sorting by id____");
        for(Person per:personArrayList)
        {
            System.out.println(per);
        }
    }
}
