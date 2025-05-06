package com.sangita.basics;

public class MultiplicationTable {

	private int index;
	
	MultiplicationTable(int index)
	{
		this.index = index;
	}
	
	public void printTable()
	{
		int result;
		
		for(int i=1;i<=10;i++)
		{
			result = i*index;
			System.out.println(index+" x "+i+" = "+result);
		}
	}
	
}
