package com.sangita.basics;

public class PrimeReturn {

	private int number;
	
	PrimeReturn(int number)
	{
		this.number = number;
	}
	
	public int calculate()
	{
		
		for(int i=2;i<=number/2;i++)
		{
			if(number%i == 0)
			{
				return 1;
			}
				
		}
		
		return 0;
		
	}
	
	
	public void check()
	{
		if(calculate() == 1)
			System.out.println(number+"-> not prime");
		else
			System.out.println(number+"-> prime");
	}
}
