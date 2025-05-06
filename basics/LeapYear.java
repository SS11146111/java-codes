package com.sangita.basics;

public class LeapYear {
	
	private int year;
	
	LeapYear(int year)
	{
		this.year = year;
	}

	public void check()
	{
		if((year%4==0 && year%100!=0) || year%400 ==0)
		{
			System.out.println(year+" is a leap year");
		}
		else
		{
			System.out.println(year+" is not a leap year");
		}
	}
	
}
