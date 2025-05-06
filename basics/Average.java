package com.sangita.basics;

public class Average {

	private double num1;
	private double num2;
	private double num3;
	
	Average(int num1, int num2, int num3)
	{
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	public void average()
	{
		double result = (num1+num2+num3)/3;
		System.out.println("Average = " + result);
	}
}
