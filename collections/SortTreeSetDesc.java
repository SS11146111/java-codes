package com.sangita.collections;
import java.util.*; 

class StringComparator implements Comparator<String>{  

	public int compare(String str1, String str2)
	{  
		return str2.compareTo(str1);  
	}  
} 

public class SortTreeSetDesc {
	
	Set<String> set;
	
	SortTreeSetDesc()
	{
		set = new TreeSet<>(new StringComparator());
		set.addAll(Arrays.asList("apple", "banana","cherry","mango","watermelon","strawberry"));
		
	}
	
	public void display()
	{
		set.forEach(e->System.out.print(e+" "));
	}

}
