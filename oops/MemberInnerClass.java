package com.sangita.oops;

public class MemberInnerClass {
	
	private int data;
	
	MemberInnerClass(int data)
	{
		this.data = data;
	}
	
	class InnerClass{
		
		public void display()
		{
			System.out.println(data);
		}
	}

}
