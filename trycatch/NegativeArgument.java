package com.sangita.trycatch;

public class NegativeArgument {
	
	private int index;
	
	NegativeArgument(int index)
	{
		this.index = index;
	}
	
	public void findElement()
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		try 
		{	
			if(index<0 || index>9)
			{
				throw new IllegalArgumentException("Index cannot be negative or greater than 9");
			}
			else
			{
				for(int i=0;i<arr.length;i++)
				{
					if(i==index)
					System.out.println("Element at "+index+" = "+arr[index]);
				}
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
