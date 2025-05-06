package com.sangita.basics;

import java.util.Scanner;

public class Calculator {

	private int num1;
	private int num2;
	private char op;
	
	Calculator()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number, second number and operator: ");
		this.num1 = sc.nextInt();
		this.num2 = sc.nextInt();
		this.op = sc.next().charAt(0);
		sc.close();
	}
	
	public float calculate()
	{
		float result;
		
		switch(op)
		{
			case '+': result = num1+num2;
					break;
			case '-': result = num1-num2;
					break;
			case '*': result = num1*num2;
					break;
			case '/': if(num2 !=0) {result = num1/num2;} else {result = 0;}
					break;
			case '%': result = num1%num2;
					break;
			default: result = -1;
		}
		
		return result;
	}
	
	public void display()
	{
			float result = calculate();
			if(result == 0 && op=='/')
				System.out.println("Invalid division operation");
			else if(result == -1)
				System.out.println("Invalid operator");
			else 
				System.out.println(" "+num1+op+num2+"="+result);
	}		
}
