package com.sangita.collections;

import java.util.*;

public class FIFOLinkedList {

	LinkedList<Integer> list = new LinkedList<Integer>();
	
	FIFOLinkedList()
	{
		for(int i=1;i<=10;i++)
		{
			list.addLast(i);
		}
		
	}
	
	
	public void display()
	{
		list.forEach(e -> System.out.print(e+" "));
		System.out.println();
	}
	
	public void add(int ele)
	{
		list.addLast(ele);
		display();
	}
	
	public void remove()
	{
		list.removeFirst();
		display();
	}
}
