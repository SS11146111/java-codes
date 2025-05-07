package com.sangita.collections;

import java.util.*;

public class ReverseArrayList {
	
	List<Integer> list = new ArrayList<Integer>();
	
	ReverseArrayList()
	{
		for(int i=1;i<=10;i++)
		{
			list.add(i);
		}
		System.out.print("Initial List: ");
		displayList();
	}
	
	public void displayList()
	{
		for(int i: list)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
	}
	
	public void reverse()
	{
		list = list.reversed();
		System.out.print("Reversed List: ");
		displayList();
	}
	
	

}
