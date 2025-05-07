package com.sangita.trycatch;

class InvalidFileFormatException extends Exception {
    public InvalidFileFormatException(String message) {
        super(message);
    }
}

// Custom unchecked exception
class NegativeNumberException extends RuntimeException {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class CustomCheckedUnchecked {

	  public void readFile(String filePath) throws InvalidFileFormatException 
	  {
	        if (!filePath.endsWith(".txt")) {
	            throw new InvalidFileFormatException("Only .txt files are allowed.");
	        }
	        System.out.println("Reading from file: " + filePath);
	  }
	  
	  public void checkNumber(int number) 
	  {
	        if (number < 0) {
	            throw new NegativeNumberException("Negative numbers are not allowed.");
	        }
	        System.out.println("Valid number: " + number);
	  }

}
