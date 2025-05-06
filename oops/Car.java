package com.sangita.oops;

public class Car {

	private String model;
	private String brand;
	private String year;
	
	Car(String model, String brand, String year)
	{
		this.model = model;
		this.brand = brand;
		this.year = year;
	}
	
	@Override
	public String toString()
	{
		return "Brand: "+brand+" ,Model: "+model+" ,Year: "+year;
		
	}
}
