package com.sangita.filehandling;

import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    transient int age; // transient field

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();       // default serialization for non-transient fields
        oos.writeInt(age);              // manually serialize the transient field
    }

   
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();        // default deserialization
        age = ois.readInt();            // manually read the transient field
    }
}

