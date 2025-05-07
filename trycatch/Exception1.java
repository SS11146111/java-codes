package com.sangita.trycatch;

public class Exception1 {

	private double num1;
	private double num2;
	
	Exception1(double num1, double num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void divide()
	{
		try {
			
			if(num2 == 0)
			{
				throw new ArithmeticException("Invalid Operation");
			}
			else
			{
				double result = (double)num1/num2;
				System.out.println(num1+"/"+num2+"="+result);
			}
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
