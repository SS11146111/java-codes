package com.sangita.filehandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;



public class SerializeEmp {
	
	public void serializeObj()
	{
		try
		{
			Employee1 emp = new Employee1("Sangita","112","Software Engineer");
			FileOutputStream fout=new FileOutputStream("C:\\Users\\User\\eclipse-workspace\\practice_codes\\codes\\src\\com\\sangita\\filehandling\\emp1.txt");    
			ObjectOutputStream out=new ObjectOutputStream(fout);    
			out.writeObject(emp);    
			out.flush();        
			out.close();    
			System.out.println("success");   
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
