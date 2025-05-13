package com.sangita.filehandling;

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
	//private static final long serialVersionUID = 2L;

    String name;
    int age;
    String address;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
      
    }

    public String toString() {
        return name + " | " + age + " | " + address;
    }
}

public class SerializePerson {
    public void call() throws Exception {
        Person p = new Person("Alice", 30);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\User\\eclipse-workspace\\practice_codes\\codes\\src\\com\\sangita\\filehandling\\person.ser"));
        out.writeObject(p);
        out.close();

        System.out.println("Serialized: " + p);
    }
    
    
    public void print() throws Exception {
    	
    	 ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\\\Users\\\\User\\\\eclipse-workspace\\\\practice_codes\\\\codes\\\\src\\\\com\\\\sangita\\\\filehandling\\\\person.ser"));
         Person p = (Person) in.readObject();
         in.close();

         System.out.println("Deserialized: " + p);
    }
}

