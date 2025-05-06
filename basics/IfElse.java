package com.sangita.basics;

public class IfElse {
	
	private int num;
	
	IfElse(int num)
	{
		this.num = num;
	}
	
	public void check()
	{
		if(num%2 == 0)
			System.out.println(num + " is even ");
		else
			System.out.println(num + " is odd ");
	}
	

}
