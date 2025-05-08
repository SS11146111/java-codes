package com.sangita.collections;

import java.util.*;

public class MapDemo1 {
	
	Map<Integer,Character> map ;

	MapDemo1()
	{
		map = new HashMap<Integer,Character>();
		
	}

	public void addPairs()
	{
		for(int i=97;i<=105;i++)
		{
			map.put(i,(char)i);
		}
		System.out.println();
	}
	
	public void removePairs(Integer key)
	{
		map.remove(key);
		System.out.println();
	}
	
	public void display()
	{
		for(Map.Entry<Integer,Character> m:map.entrySet())
		{    
	       System.out.println(m.getKey()+"->"+m.getValue());    
	    }  
		
	}
	

}
