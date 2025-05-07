package com.sangita.collections;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesList {
	
	List<Integer> list = new ArrayList<Integer>();
	Set<Integer> set = new HashSet<Integer>();
	
	RemoveDuplicatesList()
	{
		for(int i =1;i<=10;i++) 
		{
			list.add(i); 
			list.add(i);
		}
	}

	
	public void displayList()
	{
		System.out.print("While in List: ");
		for(int i: list)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
	}
	
	public void removeDuplicates()
	{
		set = list.stream().collect(Collectors.toSet());
		System.out.print("After converting to Set: ");
		
	    for(int i: set)
		{
			System.out.print(i+" ");
		}
			
		System.out.println();
		
	}
	
}
