package com.sangita.java8;
import java.util.*;

public class SortLambda {
	
	List<String> list = new ArrayList<String>();
	
	public void add()
	{
		list.add("cherry");
		list.add("apple");
		list.add("banana");
		list.add("pineapple");
		list.add("orange");
		list.add("kiwi");
	}
	
	public void display()
	{
		list.forEach(e->System.out.print(e+" "));
		System.out.println();
	}
	
	public void toSort()
	{
		Collections.sort(list, (str1,str2)->{return str1.compareTo(str2);});
	}

}
