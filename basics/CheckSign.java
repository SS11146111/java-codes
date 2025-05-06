package com.sangita.basics;

public class CheckSign {
	
	private int num;
	
	CheckSign(int num)
	{
		this.num = num;
	}
	
	public void checkSign()
	{
		if(num>0)
			System.out.println("Positive");
		else if(num<0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
	}
}
