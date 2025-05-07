package com.sangita.trycatch;

public class InvalidAgeException extends Exception{
	
	InvalidAgeException(String str)
	{
		super(str);
	}

}

class CheckAge 
{
	private int age;
	
	CheckAge(int age)
	{
		this.age = age;
	}
	
    public void validate() throws InvalidAgeException
    {
    	if(age<18)
    	{
    		throw new InvalidAgeException("Not eligible to vote");
    	}
    	else
    	{
    		System.out.println("Eligible to vote");
    	}
    }
}
