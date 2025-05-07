package com.sangita.trycatch;

public class FinallyException {

	public void method()
	{
		try 
		{
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			throw new ArithmeticException("Just testing");
		}
	}
}
