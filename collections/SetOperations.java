package com.sangita.collections;

import java.util.*;

public class SetOperations {

	Set<Integer> set1;
	Set<Integer> set2;
	
	SetOperations()
	{
		set1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
		set2 = new HashSet<Integer>(Arrays.asList(4,5,6,7,8));
		display(set1);
		display(set2);
		
	}
	
	public void display(Set<Integer> set)
	{
		set.forEach(e-> System.out.print(e+" "));
		System.out.println();
	}
	
	public void union()
	{
		Set<Integer> temp = new HashSet<Integer>(set1);
		temp.addAll(set2);
		System.out.print("Union: ");
		display(temp);
	}
	
	public void intersection()
	{
		Set<Integer> temp = new HashSet<Integer>(set1);
		temp.retainAll(set2);
		System.out.print("Intersection: ");
		display(temp);
		
	}
	
	public void difference()
	{
		Set<Integer> temp = new HashSet<Integer>(set1);
		temp.removeAll(set2);
		System.out.print("Difference: ");
		display(temp);
		
	}
	
	
}
