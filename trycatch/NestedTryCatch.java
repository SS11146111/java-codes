package com.sangita.trycatch;

public class NestedTryCatch {

	private int[] arr = {1,2,3,4,5};
	
	public void display()
	{
		
		try {
			
			
			for(int i=0;i<arr.length;i++) 
			{ System.out.print(arr[i]+" "); }
			
			try {
				
				arr=null;
				System.out.println(arr.length);
				
			}catch(NullPointerException e)
			{
				System.out.println("\nArray is now set to null");
			}
			 
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index out of bounds");
		}
	}
}
