package com.sangita.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountFile {
	
	public void count() throws Exception
	{
		   int characterCounter = 0;
		   int wordCounter = 0;
		   int lineCounter = 0;
		   
    	   FileReader fr = new FileReader("C:\\Users\\User\\eclipse-workspace\\practice_codes\\codes\\src\\com\\sangita\\filehandling\\text1.txt");
    	   int i; 
    	   while((i=fr.read())!=-1)   
    	   {
    		   char ch = (char)i;
    		   characterCounter++;
    		   
    		   if(ch=='\n')
    			   lineCounter++;
    		   
    	   }
			
    	   lineCounter+=1;
    	   
    	   BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\eclipse-workspace\\practice_codes\\codes\\src\\com\\sangita\\filehandling\\text1.txt"));

           String line;
           while ((line = reader.readLine()) != null) {
               String[] words = line.trim().split("\\s+"); // split by any whitespace
               if (!line.trim().isEmpty()) {
                   wordCounter += words.length;
               }
           }
    	   
    	   System.out.println("Character Counter: "+characterCounter);
    	   System.out.println("Word Counter: "+wordCounter);
    	   System.out.println("Line Counter: "+lineCounter);
	    	    
    	   fr.close();
    	   reader.close();
	}

}
