package com.sangita.filehandling;

import java.io.Serializable;

class Employee1 implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String id;
	String position;
	
	public Employee1(String name, String id, String position) {
		this.name = name;
		this.id = id;
		this.position = position;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", position=" + position + "]";
	}
	
	
}