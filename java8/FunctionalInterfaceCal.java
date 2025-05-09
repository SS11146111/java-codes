package com.sangita.java8;

@FunctionalInterface

interface calculator
{
	double compute(int num1, int num2, char op);
}


public class FunctionalInterfaceCal implements calculator{
	
	public double compute(int num1, int num2, char op)
	{
		
		switch(op)
		{
			case '+': return num1+num2;
					
			case '-': return num1-num2;
					
			case '*': return num1*num2;
					
			case '/': if(num2 !=0) {return (double)num1/num2;} else {System.out.println("Division by 0 is invalid"); return Double.NaN;}
					 
			case '%': if(num2 !=0) {return (double)num1%num2;} else {System.out.println("Division by 0 is invalid");  return Double.NaN;} 

			default: { System.out.println("Invalid operator");
            			return Double.NaN;}
		}
	
	}

}
