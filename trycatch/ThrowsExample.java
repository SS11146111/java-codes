package com.sangita.trycatch;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

	  private String filePath;
	  private FileReader fr;
	  
	  ThrowsExample(String filePath)
	  {
		  this.filePath = filePath;
	  }
	        
	 public void read() throws IOException 
	 {
	  
		 fr = new FileReader(filePath);
         int ch;
         while ((ch=fr.read())!= -1) {
             System.out.print((char)ch);
         }
     
	
         fr.close();
             
	  }
}
