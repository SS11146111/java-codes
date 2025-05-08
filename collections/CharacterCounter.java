package com.sangita.collections;
import java.util.*;

public class CharacterCounter {
	
	private String str;
	Map<Character,Integer> map;
	
	CharacterCounter(String str)
	{
		this.str = str;
		map = new HashMap<Character,Integer>();
		
	}
	
	public void characterCounter()
	{
		str = str.toLowerCase().replaceAll("[^a-z]", "");
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			map.merge(arr[i], 1, Integer::sum);
			
		}
		display();
	}
	
	public void display()
	{
		for(Map.Entry<Character,Integer> m : map.entrySet())
		{
			System.out.println(m.getKey()+"->"+m.getValue());
		}
	}
	

}
