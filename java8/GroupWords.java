package com.sangita.java8;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupWords {
	
	private String[] arr;
	private List<String> list;
	private Map<String, Long> map;
	
	GroupWords(String str)
	{
		this.arr = str.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");
		this.list = new ArrayList<String>();
		for(String i : arr)
		{
			list.add(i);
		}
	}
	
	public void groupWords()
	{
		
		map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
	}
	
	public void display()
	{
			
		map.forEach((k,v) -> System.out.println(k+"->"+v));
	}

}
