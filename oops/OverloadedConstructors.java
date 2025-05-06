package com.sangita.oops;

public class OverloadedConstructors {

	private String str1, str2;
	
	OverloadedConstructors()
	{
		System.out.println("Default constructor");
	}
	
	OverloadedConstructors(String str)
	{
		this.str1 = str;
		System.out.println("Single Parameterized constructor: Welcome "+this.str1);
	}
	
	OverloadedConstructors(String str1, String str2)
	{ 
		this.str1 = str1;
		this.str2 = str2;
		System.out.println("Double Parameterized constructor: Welcome "+this.str1+" "+this.str2);
	}
	
	OverloadedConstructors(OverloadedConstructors obj)
	{
		this.str1 = obj.str1;
		System.out.println("Copy constructor: Welcome "+this.str1);
	}
}
