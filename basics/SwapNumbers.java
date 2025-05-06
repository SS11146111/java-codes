package com.sangita.basics;

public class SwapNumbers {

	private int num1;
	private int num2;
	
	SwapNumbers(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
		
	}
	
	void display()
	{
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
	}
	public void swapOne()
	{
		int temp = num1;
		num1 = num2;
		num2 = temp;
		display();
		
	}
	
	public void swapTwo()
	{
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		display();
	}
}
