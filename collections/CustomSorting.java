package com.sangita.collections;

import java.util.*;

class ElementComparator implements Comparator<Integer>
{  
	
	public int compare(Integer e1, Integer e2){   
		
		if(e1==e2)  
			return 0;  
		else if(e1<e2)  
			return 1;  
		else  
			return -1;  
	}  
}  

public class CustomSorting {
	
	Set<Integer> set ;
	
	CustomSorting()
	{
		set = new TreeSet<>(new ElementComparator());
		set.addAll(Arrays.asList(8,1,4,2,5,10,6,3));
		
	}
	
	public void display()
	{
	    set.forEach(e -> System.out.print(e + " "));
	}

}
