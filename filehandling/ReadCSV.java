package com.sangita.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
	
	 public void readCSV(String filePath) {
	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            String line;

	            System.out.println("CSV Content in Tabular Format:\n");

	            while ((line = br.readLine()) != null) {
	                String[] values = line.split(","); // split by comma
	                for (String value : values) {
	                    System.out.printf("%-15s", value); // format with padding
	                }
	                System.out.println(); // new line after each row
	            }

	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	    }

}
