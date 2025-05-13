package com.sangita.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class HandleTransient {

	public void handleTransient()
	{
		 Student student = new Student("Peter", 25);

		 try {
	        // Serialize
	        FileOutputStream fileOut = new FileOutputStream("C:\\Users\\User\\eclipse-workspace\\practice_codes\\codes\\src\\com\\sangita\\filehandling\\stu1.txt");
	        ObjectOutputStream out = new ObjectOutputStream(fileOut);
	        out.writeObject(student);
	        out.close();
	        fileOut.close();

	        // Deserialize
	        FileInputStream fileIn = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\practice_codes\\codes\\src\\com\\sangita\\filehandling\\stu1.txt");
	        ObjectInputStream in = new ObjectInputStream(fileIn);
	        Student deserializedStudent = (Student) in.readObject();
	        in.close();
	        fileIn.close();

	        // Output
	        System.out.println("Name: " + deserializedStudent.name); // Peter
	        System.out.println("Age: " + deserializedStudent.age);   // 25 (restored manually)
		 }
		 catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
	}

}
