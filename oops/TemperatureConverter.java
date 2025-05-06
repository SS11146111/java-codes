package com.sangita.oops;

public class TemperatureConverter {
	
	private double celcius;
	
	TemperatureConverter(double celcius)
	{
		this.celcius = celcius;
	}
	
	public void celciusToFah()

	{
		double fahrenheit = (1.8 * celcius)+32;
		System.out.println(celcius+"->"+fahrenheit);
	}
	
}
