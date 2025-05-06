package com.sangita.oops;

public class Employee {
	
	private String name;
	private String position;
	private String id;
	
	Employee(String name, String position, String id)
	{
		this.name = name;
		this.position = position;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void display()
	{
		System.out.println("Employee : [ name: "+getName()+" ,position: "+getPosition()+" ,Id: "+getId()+" ]");
	}

}
