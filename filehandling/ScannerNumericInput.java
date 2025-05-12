package com.sangita.filehandling;

import java.util.Scanner;

public class ScannerNumericInput {
	
	public void checkInt()
	{
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt())
		{
			System.out.println("You have entered an integer value ");
		}
		else
		{
			System.out.println("You have entered a non integer value ");
		}
		sc.close();
	}

}
