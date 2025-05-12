package com.sangita.filehandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ConsoleRead {

	public void readConsole()
	{
		 try {
	            // Set up BufferedReader to read from standard input (keyboard)
	            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	            System.out.print("Enter some text: ");
	            String input = reader.readLine(); // Reads a line of text

	            System.out.println("You entered: " + input);

	            reader.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
	}
}
