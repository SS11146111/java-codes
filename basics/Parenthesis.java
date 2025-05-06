package com.sangita.basics;

public class Parenthesis {

	private int a,b,c,d;
	
	Parenthesis(int a, int b, int c, int d)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	
	public void display()
	{
		int result = (a+b)*c/d;
		System.out.println("("+a+"+"+b+")*"+c+"/"+d+" = "+result);
		result = a+b*(c/d);
		System.out.println(" "+a+"+"+b+"*("+c+"/"+d+") = "+result);
		result = a+b*c/d;
		System.out.println(" "+a+"+"+b+"*"+c+"/"+d+" = "+result);
		result = a+(b*c)/d;
		System.out.println(" "+a+"+"+"("+b+"*"+c+")/"+d+" = "+result);
	}
}
