package com.sangita.basics;

public class Fibonacci {
	
	private int terms;
	
	Fibonacci(int terms)
	{
		this.terms = terms;
	}
	
	public void calculate()
	{
		int firstTerm = 0;
		int secondTerm = 1;
		int sum = firstTerm + secondTerm;
		
		if(terms== 1)
		{
			System.out.print(firstTerm+" ");
		}
		else if(terms == 2)
		{
			System.out.print(firstTerm+" "+secondTerm+" ");
		}
		else if(terms == 3)
		{
			System.out.print(firstTerm+" "+secondTerm+" "+sum);
			
		}
		else
		{
			System.out.print(firstTerm+" "+secondTerm+" "+sum+" ");
			
			for(int i=4;i<=terms;i++)
			{
				firstTerm = secondTerm;
				secondTerm = sum;
				sum = firstTerm+secondTerm;
				System.out.print(sum+" ");
			}
		}
		
	}
	

}
