package com.sangita.java8;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCharacter {

	private List<Character> list; 
	Map<Character,Long>map;
	
	NonRepeatedCharacter(String str)
	{
		char[] arr = str.toCharArray();
		list = new ArrayList<Character>();
		for(char i : arr)
		{
			
			if(i != ' ')
			list.add(i);
		}
		
	}
	
	public void findCharacter()
	{
		map = list.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		
	}
	
	public void display()
	{
		for(Map.Entry<Character,Long> m : map.entrySet())
		{
			if(m.getValue()==1)
			{
				System.out.println(m.getKey());
				break;
			}
		}
	}
}
