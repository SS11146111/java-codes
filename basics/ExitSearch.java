package com.sangita.basics;

public class ExitSearch {
	
	private int[] arr = {1,2,3,4,5,6,7,8,9,10};
	private int num;
	
	ExitSearch(int num)
	{
		this.num = num;
		
	}
	
	public void search()
	{
		for(int i=0; i<arr.length; i++)
		{
			if(num == arr[i])
			{
				System.out.println("Found");
				System.exit(0);
				System.out.println("After exit");
			}
		}
		
		System.out.println("Not Found");
		System.exit(0);
		System.out.println("After exit");
	}
	
	

}
