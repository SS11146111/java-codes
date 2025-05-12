package com.sangita.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UppercaseFile {
	public void convertToUppercase(String inputPath, String outputPath) throws IOException {
        // Readers and Writers
        BufferedReader reader = new BufferedReader(new FileReader(inputPath));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));

        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(line.toUpperCase());
            writer.newLine(); // preserve line breaks
        }

        reader.close();
        writer.close();

        System.out.println("File converted to uppercase and saved to: " + outputPath);
    }

}
