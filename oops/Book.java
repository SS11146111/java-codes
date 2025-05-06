package com.sangita.oops;

public class Book {

	private String title;
	private String author;
	private String version;
	
	Book(String title, String author, String version)
	{
		this.title = title;
		this.author = author;
		this.version = version;
	}
	
	@Override
	
	public String toString()
	{
		return "Title: "+title+" ,Author: "+author+" ,Version: "+version;
	}
}
