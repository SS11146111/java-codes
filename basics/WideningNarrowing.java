package com.sangita.basics;

public class WideningNarrowing {
	
	private int num1;
	private double num2;
	
	WideningNarrowing(int num1, double num2)
	{
		this.num1= num1;
		this.num2 = num2;
	}

	public void convert()
	{
		long result1 = (long)num1;
		int result2 = (int)num2;
		
		System.out.println("int -> long: "+ num1 +"->"+ result1);
		System.out.println("double -> int: "+ num2 +"->"+ result2);
	}
}
