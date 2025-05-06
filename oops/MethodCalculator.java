package com.sangita.oops;

public class MethodCalculator {
	
	private int num1;
	private int num2;
	private char op;
	
	MethodCalculator(int num1, int num2, char op)
	{
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}
	
	public int add()
	{
		return num1+num2;
	}
	
	public int subtract() 
	{
		return num1-num2;
	}
	
	public int multiply()
	{
		return num1*num2;
	}
	
	public double divide()
	{
		if(num2 == 0)
			return -1;
		else
			return num1/num2;
	}
	
	public double modulo()
	{
		if(num2 == 0)
			return -1;
		else
			return num1%num2;
	}
	
	public void select()
	{
		switch(op)
		{
			case '+' : System.out.println(num1+"+"+num2+"="+add());
						break;
			case '-' : System.out.println(num1+"-"+num2+"="+subtract());
						break;
			case '*' : System.out.println(num1+"*"+num2+"="+multiply());
						break;
			case '/' : System.out.println(num1+"/"+num2+"="+divide());
						break;
			case '%' : System.out.println(num1+"%"+num2+"="+modulo());
						break;
			default	 : System.out.println("Invalid operator!!");
		}
	}
}
