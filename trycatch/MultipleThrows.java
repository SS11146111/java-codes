package com.sangita.trycatch;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MultipleThrows {

	  private String filePath;
	 
	  
	  MultipleThrows(String filePath)
	  {
		  this.filePath = filePath;
	  }
	        
	 public void read() throws IOException, NumberFormatException
	 {
	  
		 File myObj = new File(filePath);
	     Scanner myReader = new Scanner(myObj);
	      
	     while (myReader.hasNextLine()) 
	     {
	        String data = myReader.nextLine();
	        System.out.println(Integer.valueOf(data));
	     }
	     
	     myReader.close();
	     
	  }
}
