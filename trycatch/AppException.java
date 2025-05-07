package com.sangita.trycatch;

public class AppException extends Exception 
{
	AppException(String str)
	{
		super(str);
	}

}


class DatabaseException extends AppException
{

	DatabaseException(String str) 
	{
		super(str);
		
	}

}


class FileException extends AppException
{
	FileException(String str)
	{
		super(str);
	}
	
}

class Demo2
{
	
	public void display1() throws DatabaseException
	{
		throw new DatabaseException("Database Connection Error");
	}
	
	public void display2() throws FileException
	{
		throw new FileException("File not found error");
	}

}
