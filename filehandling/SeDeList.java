
  package com.sangita.filehandling;
  
  import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream; 
  import java.util.*;
  
  
  public class SeDeList {
  
  List<Employee1> list = new ArrayList<Employee1>();

  
  public void addObjects() { 
	  
	  list.add(new Employee1("Sangita","112","Software Engineer")); 
	  list.add(new Employee1("Ben","113","Civil Engineer")); 
	  list.add(new Employee1("Claire","114","Mechanical Engineer")); 
	  list.add(new Employee1("Sophia","115","IT Engineer")); 
	  list.add(new Employee1("Daniel","116","Software Engineer")); 
  }
  
  public void objectSerialize() 
  { 
	  addObjects(); 
	  try
	  {
		  FileOutputStream fout=new FileOutputStream("C:\\Users\\User\\eclipse-workspace\\practice_codes\\codes\\src\\com\\sangita\\filehandling\\emp2.txt"); 
		  ObjectOutputStream out=new ObjectOutputStream(fout); 
		  out.writeObject(list);
		  out.flush(); 
		  out.close();
		  System.out.println("Success...");
	  }catch(Exception e)
	  {
		  System.out.println(e.getMessage());
	  }
  
  }
  
  public void objectDeserialize() 
  { 
	  
	  try
	  {
		  FileInputStream fin=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\practice_codes\\codes\\src\\com\\sangita\\filehandling\\emp2.txt"); 
		  ObjectInputStream in=new ObjectInputStream(fin); 
		  @SuppressWarnings("unchecked")
		  List<Employee1> print = (List<Employee1>) in.readObject();
	
		  for(Employee1 e: print)
		  {
			  System.out.println(e);  
		  }
		  
		  in.close();
	  }catch(Exception e)
	  {
		  System.out.println(e.getMessage());
	  }
  
  }
  
  
 }
 