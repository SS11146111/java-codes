package com.sangita.collections;

import java.util.*;

public class HashSetDemo {
	
	Set<Integer> set = new HashSet<Integer>();
	
	public void addElement(int ele)
	{
		set.add(ele);
	}
	
	public void removeElement(int ele)
	{
		set.remove(ele);
	}
	
	public void containElement(int ele)
	{
		System.out.println(set.contains(ele));
	}

	public void display()
	{
		set.forEach(e -> System.out.print(e+" "));
		System.out.println();
	}
}
