package com.sangita.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public void readFile() throws IOException
	{
	       
	       try 
	       {
	    	   FileReader fr = new FileReader("C:\\Users\\User\\eclipse-workspace\\practice_codes\\codes\\src\\com\\sangita\\filehandling\\text1.txt");
	    	   int i; 
	    	   while((i=fr.read())!=-1)    
				      System.out.print((char)i);
	    	   fr.close();
	    	   
	       } 
	       catch (FileNotFoundException e) 
	       {
			
	    	   e.printStackTrace();
	       }    
	          
	       
	}
}
