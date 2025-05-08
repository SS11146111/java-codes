package com.sangita.collections;

import java.util.*;

public class SortTreeSet {
	
	Set<Integer> set = new TreeSet<Integer>(Arrays.asList(2,1,6,4,7,3,8,5));

	public void display() 
	{
		set.forEach(e->System.out.print(e+" "));
	}
}
