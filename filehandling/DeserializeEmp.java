package com.sangita.filehandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class DeserializeEmp {
	
	public void deserializeObj()
	{
		 try
		 {  
			  
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\User\\eclipse-workspace\\practice_codes\\codes\\src\\com\\sangita\\filehandling\\emp1.txt"));  
			  Employee1 emp=(Employee1)in.readObject();  
			  
			  System.out.println(emp.name+","+emp.id+","+emp.position);  

			  in.close();  
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }  
		 
	}

}
