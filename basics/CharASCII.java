package com.sangita.basics;

import java.util.Scanner;

public class CharASCII {

	private char ch;
	
	CharASCII()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		this.ch = sc.next().charAt(0);
		sc.close();
	}
	
	public void getASCII()
	{
		int value = ch;
		System.out.println("ASCII value = "+value);
	}

}
