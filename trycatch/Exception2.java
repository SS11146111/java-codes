package com.sangita.trycatch;

public class Exception2 {

	private int[] arr = {1,2,3,4,5};
	
	public void display()
	{
		try {
			
			/*
			 * for(int i=0;i<=arr.length;i++) { System.out.print(arr[i]+" "); }
			 */
			
			arr= null;
			System.out.println(arr.length);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index out of bounds");
		}
		catch(NullPointerException e)
		{
			System.out.println("Array is set to null");
		}
		
	}
	
}
