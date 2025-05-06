package com.sangita.basics;

public class CountDigits {
	
	int number;
	
	CountDigits(int number)
	{
		this.number = number;
	}
	
	public void calculate()
	{
		int count = 0;
		int temp = number;
		
		while(temp!=0) 
		{
			
			count++;
			temp=temp/10;
		}
		
		System.out.println(number+"->"+count);
	}

}
