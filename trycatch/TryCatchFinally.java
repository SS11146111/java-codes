package com.sangita.trycatch;


import java.io.FileReader;
import java.io.IOException;

public class TryCatchFinally {
	
	  private String filePath;
	  private FileReader fr;
	  
	  TryCatchFinally(String filePath)
	  {
		  this.filePath = filePath;
	  }
	        
	 public void read()
	 {
	  try
	  {
		  fr = new FileReader(filePath);
          int ch;
          while ((ch=fr.read())!= -1) {
              System.out.print((char)ch);
          }
      } 
	  catch (IOException e) {
          
		  System.err.println("Error reading the file: " + e.getMessage());
      }
	  finally
	  {
		  if (fr != null) {
              try {
                  fr.close();
              } catch (IOException e) {
                  System.err.println("Error closing the file: " + e.getMessage());
              }
          }
	  }
	 }

}

