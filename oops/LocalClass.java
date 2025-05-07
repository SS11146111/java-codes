package com.sangita.oops;

public class LocalClass {
	
	private int data;
	
	LocalClass(int data)
	{
		this.data = data;
	}
	
	public void localClassMethod() {
		
		final int value = 60;
		
		class LocalInnerClass{
			
			public void display()
			{
				System.out.println(value+","+data);
			}
		}
		
		LocalInnerClass obj = new LocalInnerClass();
		obj.display();
	}
	

}
