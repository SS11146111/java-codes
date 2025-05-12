package com.sangita.filehandling;

import java.io.FileReader;
import java.io.FileWriter;


public class CopyFile {
	

	public void copyFile() throws Exception
	{
	       
	     FileReader fr = new FileReader("C:\\Users\\User\\eclipse-workspace\\practice_codes\\codes\\src\\com\\sangita\\filehandling\\text1.txt");
	     FileWriter fw = new FileWriter("C:\\Users\\User\\eclipse-workspace\\practice_codes\\codes\\src\\com\\sangita\\filehandling\\text2.txt");    
	     int i; 
	     while((i=fr.read())!=-1)    
	     {
	    	 fw.write((char)i);
	     }
	     fr.close();
	     fw.close();
	     System.out.println("Success...");
	       
	}

}
