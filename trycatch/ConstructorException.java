package com.sangita.trycatch;

public class ConstructorException extends Exception {

	ConstructorException(String str, int code)
	{
		super(str);
		System.err.println("Error code: "+code);
	}
}


class Demo{
	
	public void print() throws ConstructorException
	{
		throw new ConstructorException("Hi, error here ", 101);
	}
}
