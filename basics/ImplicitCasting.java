package com.sangita.basics;

public class ImplicitCasting {

	private int num;
	private double value;
	
	ImplicitCasting(int num)
	{
		this.num = num;
	}
	
	public void casting()
	{
		value = num;
		System.out.println("int -> double: "+ num +"->"+ value);
	}
}
