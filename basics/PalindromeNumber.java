package com.sangita.basics;

public class PalindromeNumber {
	
	private int number;
	
	
	PalindromeNumber(int number)
	{
		this.number = number;
	}
	
	public int reverseCal()
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
		
		return a;
	}

	public void check()
	{
		if(number == reverseCal())
		{
			System.out.println(number+" is a Palindrome");
		}
		else
		{
			System.out.println(number+" is not a Palindrome");
		}
		
	}
}
