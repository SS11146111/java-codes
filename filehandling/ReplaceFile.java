package com.sangita.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceFile {

	public void replaceWord() throws IOException
	{
		 
		        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\eclipse-workspace\\practice_codes\\codes\\src\\com\\sangita\\filehandling\\text1.txt"));
		        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\User\\eclipse-workspace\\practice_codes\\codes\\src\\com\\sangita\\filehandling\\text4.txt"));

		        String line;
		        String target = "java";
		        String replacement = "Sangita";
		        
		        while ((line = reader.readLine()) != null) {
		            String modifiedLine = line.replaceAll("\\b" + target + "\\b", replacement); // word-boundary replacement
		            writer.write(modifiedLine);
		            writer.newLine(); // preserve line structure
		        }

		        reader.close();
		        writer.close();
    }

}
