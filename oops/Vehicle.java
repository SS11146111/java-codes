package com.sangita.oops;

public class Vehicle {
	
	public String str ="Go";
	
	public void start()
	{
		System.out.println("Starting vehicle..."+str);
	}
	
}

class Bike extends Vehicle{
	
	public void start()
	{
		System.out.println("Starting Bike..."+str);
	}
	
}

class Car1 extends Vehicle{
	
	public void start()
	{
		System.out.println("Starting Car..."+str);
	}
	
}
