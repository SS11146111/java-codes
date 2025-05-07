package com.sangita.oops;

public class MathUtils {
	
	public static void factorial(int number)
	{
		int f = 1;
		
		for(int i=1;i<=number;i++)
		{
			f=f*i;
			
		}
		
		System.out.println("Factorial of "+ number + " = "+f);
	}
	
	public static void isPrime(int number)
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
		
		if(flag == 1)
			System.out.println(number+"-> not prime");
		else
			System.out.println(number+"-> prime");
		
	}
	
	

}
