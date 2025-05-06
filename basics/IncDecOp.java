package com.sangita.basics;

public class IncDecOp {

	private int num;
	
	IncDecOp(int num)
	{
		this.num = num;
	}
	
	public void display()
	{

		System.out.println("Post-increment: "+ num++);
		System.out.println("Current value: "+ num);
		System.out.println("Pre-increment: "+ ++num);
		System.out.println("Current value: "+ num);
	}
}
