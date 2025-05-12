package com.sangita.filehandling;

import java.util.Scanner;

public class ScannerRead {
	
	public void readScanner()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String line = sc.nextLine();
		System.out.print("Enter an integer: ");
		int number = sc.nextInt();
		System.out.print("Enter a float: ");
		float value = sc.nextFloat();
		System.out.print("Enter a double: ");
		double result = sc.nextDouble();
		System.out.println("String: "+line+"\n"+"Integer: "+number+"\n"+"Float: "+value+"\n"+"Double: "+result);
		sc.close();
	}

}
