package com.sangita.basics;

public class Power {

	private int base;
	private int exponent;
	
	Power(int base, int exponent)
	{
		this.base = base;
		this.exponent = exponent;
		
	}
	
	public void calculate()
	{
		int result=1;
		
		for(int i=1;i<=exponent;i++)
		{
			result *= base;
		}
		
		System.out.println(base+"^"+exponent+" = "+result);
	}
}
