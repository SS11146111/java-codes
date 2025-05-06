package com.sangita.oops;

public class MethodOverloading {

	public void print()
	{
		System.out.println("Default print");
	}
	
	public void print(String str)
	{
		System.out.println("Print: "+str);
	}
	
	public void print(String str1, String str2)
	{
		System.out.println("Print: "+str1+","+str2);
	}
	
}
