package com.sangita.oops;

public class StaticNestedClass {

	private static int data = 889;
	
	public static class NestedClass{
		
		public static void display()
		{
			System.out.println(data);
		}
		
	}
}
