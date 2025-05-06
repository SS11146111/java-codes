package com.sangita.basics;

public class SumDigits {

	private int number;
	
	SumDigits(int number)
	{
		this.number = number;
	}
	
	public void calculate()
	{
		int r;
		int sum = 0;
		int temp = number;
		
		while(temp!=0) 
		{
			r=temp%10;
			sum+=r;
			temp=temp/10;
		}
		
		System.out.println(number+"->"+sum);
	}
	
	
}
