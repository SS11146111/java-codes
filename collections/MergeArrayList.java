package com.sangita.collections;

import java.util.*;

public class MergeArrayList {
	
	List<String> list1 = new ArrayList<String>();
	List<String> list2 = new ArrayList<String>();
	
	void addElements()
	{
		list1.add("Sangita");
		list1.add("Rahul");
		list1.add("Vinod");
		list1.add("Rakesh");
		
		System.out.print("List 1: ");
		list1.forEach(e -> System.out.print(e + " "));
		System.out.println();
		
		list2.add("Saha");
		list2.add("Parashar");
		list2.add("Khanna");
		list2.add("Roshan");
		
		System.out.print("List 2: ");
		list2.forEach(e -> System.out.print(e + " "));
		System.out.println();
	}
	
	public void merge() 
	{
		list1.addAll(list2);
		System.out.print("Merged List: ");
		list1.forEach(e -> System.out.print(e + " "));
		System.out.println();
	}
}
