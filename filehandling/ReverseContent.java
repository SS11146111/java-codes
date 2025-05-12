package com.sangita.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReverseContent {
	
	public void reverse() throws Exception
	{
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\eclipse-workspace\\practice_codes\\codes\\src\\com\\sangita\\filehandling\\text1.txt"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\User\\eclipse-workspace\\practice_codes\\codes\\src\\com\\sangita\\filehandling\\text5.txt"));
		String line, line2;
		
		
		while((line = reader.readLine())!=null)
		{
			StringBuilder sb = new StringBuilder();
			sb.append(line);
			line2 = sb.reverse().toString();
			writer.write(line2);
			writer.newLine();
		
		}
		
		System.out.println("Success...");
		reader.close();
		writer.close();
	}

}
