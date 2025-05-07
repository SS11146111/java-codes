package com.sangita.oops;

public abstract class AbstractShape {

	public abstract void calculateArea();
}


class CircleA extends AbstractShape{
	
	private double radius;
	
	CircleA(double radius)
	{
		this.radius = radius;
	}
	
	public void calculateArea()
	{
		System.out.println("Area of Circle = "+ (3.14*radius*radius));
	}
}

class RectangleA extends AbstractShape{
	
	private double length;
	private double breadth;
	
	RectangleA(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;  
	}
	
	public void calculateArea()
	{
		System.out.println("Area of Rectangle = "+ (length*breadth));
	}
}

class TriangleA extends AbstractShape{
	
	private double height;
	private double base;
	
	TriangleA(double height, double base)
	{
		this.height = height;
		this.base = base;  
	}
	
	public void calculateArea()
	{
		System.out.println("Area of Triangle = "+ ((height*base)/2));
	}
}




