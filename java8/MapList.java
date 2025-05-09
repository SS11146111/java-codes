package com.sangita.java8;

import java.util.*;

public class MapList {

	List<String> list;
	
	MapList()
	{
		list = new ArrayList<String>(Arrays.asList("apple","banana","cherry"));
	}
	
	public void mapToUpperCase()
	{
		list = list.stream().map(str->str.toUpperCase()).toList();
	}
	
	public void display()
	{
		list.forEach(str -> System.out.print(str+" "));
	}
}
