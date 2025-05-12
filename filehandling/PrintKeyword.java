package com.sangita.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintKeyword {
	
	public void print(String keyword) throws Exception
	{
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\eclipse-workspace\\practice_codes\\codes\\src\\com\\sangita\\filehandling\\text1.txt"));
		String line;
	    Pattern pattern = Pattern.compile("\\b" + Pattern.quote(keyword) + "\\b");

	    while ((line = reader.readLine()) != null) {
	        Matcher matcher = pattern.matcher(line);
	        if (matcher.find()) {
	            System.out.println(line);
	        }
	    }

	    reader.close();
	}

}
