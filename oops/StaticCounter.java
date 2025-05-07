package com.sangita.oops;

public class StaticCounter {
	
	private static int counter;
	
	StaticCounter()
	{
		counter++;
	}

	public static void display()
	{
		System.out.println(counter);
	}
}
