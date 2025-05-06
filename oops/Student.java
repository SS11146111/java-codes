package com.sangita.oops;

public class Student {

	private String name;
	private String id;
	private String dept;
	
	Student(String name, String id, String dept)
	{
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
	
	public void display()
	{
		System.out.println("Name: "+name+" ,ID: "+id+" ,Department: "+dept);
	}
	
}
