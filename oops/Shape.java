package com.sangita.oops;

public class Shape {

	public void area()
	{
		System.out.println("To calculate area");
	}
	
}


class Circle extends Shape{
	
	private double radius;
	
	Circle(double radius)
	{
		this.radius = radius;
	}
	
	public void area()
	{
		System.out.println("Area of circle = "+(3.14*radius*radius));
	}
	
}

class Rectangle extends Shape{
	
	private double length;
	private double breadth;
	
	Rectangle(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	public void area()
	{
		System.out.println("Area of rectangle = "+(length*breadth));
	}
	
}

class Triangle extends Shape{
	
	private double height;
	private double base;
	
	Triangle(double height, double base)
	{
		this.height = height;
		this.base = base;
	}
	
	public void area()
	{
		System.out.println("Area of triangle = "+((base*height)/2));
	}
	
}


