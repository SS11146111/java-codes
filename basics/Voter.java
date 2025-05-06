package com.sangita.basics;

public class Voter {
	
	private int age;
	private boolean indianCitizen;
	
	Voter(int age, boolean indianCitizen)
	{
		this.age = age;
		this.indianCitizen = indianCitizen;
	}
	
	public void checkEligibility()
	{
		if(age>=18 && indianCitizen == true)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println("Not eligible to vote");
		}
	}

}
