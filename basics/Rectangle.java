package com.sangita.basics;

public class Rectangle {
	
	private double length;
	private double breadth;
	
	Rectangle(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}

	public double area()
	{
		return length*breadth;
	}
	
	public double perimeter()
	{
		return 2*(length+breadth);
	}
	
	public void display()
	{
		
		System.out.println("Perimeter= "+perimeter());
		System.out.println("Area= "+area());
	}

}
