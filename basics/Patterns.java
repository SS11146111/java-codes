package com.sangita.basics;

public class Patterns {
	
	public void leftPyramid()
	{
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void leftPyramidInverted()
	{
		
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	
	public void rightPyramid()
	{
		
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			
		    System.out.println();
		}
		
	}
	
	public void rightPyramidInverted()
	{
		
		for(int i=1;i<=5;i++)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			
		    System.out.println();
		}
		
	}
	
	
	
	public void pyramid()
	{
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=1;l<i;l++)
			{
				System.out.print("*");
			}
			 System.out.println();
		}
		
	}
	
	

	public void pyramidInverted()
	{
		
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			
			for(int l=5;l>i;l--)
			{
				System.out.print("*");
			}
			 System.out.println();
		}
		
	}

}
