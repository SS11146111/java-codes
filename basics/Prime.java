package com.sangita.basics;

public class Prime {

	private int number;
	
	Prime(int number)
	{
		this.number = number;
	}
	
	public int calculate()
	{
		int flag = 0;
		
		for(int i=2;i<=number/2;i++)
		{
			if(number%i == 0)
			{
				flag=1;
				break;
			}
				
		}
		
		return flag;
		
	}
	
	
	public void check()
	{
		if(calculate() == 1)
			System.out.println(number+"-> not prime");
		else
			System.out.println(number+"-> prime");
	}
}
