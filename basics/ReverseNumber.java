package com.sangita.basics;

public class ReverseNumber {
	
	private int number;
	
	ReverseNumber(int number)
	{
		this.number = number;
		
	}
	
	public void calculate()
	{
		int r;
		int a = 0;
		int temp = number;
		
		while(temp!=0) 
		{
			r=temp%10;
			a=a*10+r;
			temp=temp/10;
		}
		
		System.out.println(number+"->"+a);
	}

}
