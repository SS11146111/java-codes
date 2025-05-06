package com.sangita.basics;

public class LargestOfThree {
	
	private int num1;
	private int num2;
	private int num3;
	
	LargestOfThree(int num1, int num2, int num3)
	{
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	public int findLargest()
	{
		if(num1>num2)
		{
			if(num1>num3)
				return num1;
			else return num3;
		}
		else 
		{
			if(num2>num3)
				return num2;
			else
				return num3;
			
		}
		
	}

}
