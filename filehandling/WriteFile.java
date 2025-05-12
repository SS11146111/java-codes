package com.sangita.filehandling;

import java.io.FileWriter;

public class WriteFile {
	
	public void write()
	{
	  try{    
           FileWriter fw=new FileWriter("C:\\Users\\User\\eclipse-workspace\\practice_codes\\codes\\src\\com\\sangita\\filehandling\\text1.txt");    
           fw.write("Welcome to javaTpoint.");    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");  
	}

}
