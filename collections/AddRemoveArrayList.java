package com.sangita.collections;

import java.util.*;

public class AddRemoveArrayList {

	List<Integer> list = new ArrayList<Integer>();
	
	public void addElement(int ele) 
	{
		list.add(ele);
	}
	
	public void removeElement(int index)
	{
		list.remove(index);
	}
	
	public void display()
	{
		for(int i: list)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
	}
}
