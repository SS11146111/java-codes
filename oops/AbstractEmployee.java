package com.sangita.oops;

public abstract class AbstractEmployee {
	
	public abstract void display();

}


class Manager extends AbstractEmployee {
	
	public void display() {
		
		System.out.println("Hi, I am Manager");
	}
}

class Developer extends AbstractEmployee{
	
	public void display() {
		
		System.out.println("Hi, I am Developer");
	}
	
}
