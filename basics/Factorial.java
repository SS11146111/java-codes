package com.sangita.basics;

public class Factorial {
	
	private int num;
	
	Factorial(int num)
	{
		this.num=num;
	}
	
	public void calculateFac()
	{
		int f = 1;
		
		for(int i=1;i<=num;i++)
		{
			f=f*i;
			
		}
		
		System.out.println("Factorial of "+ num + " = "+f);
	}
	
}
