package com.sangita.collections;

import java.util.*;

public class SortMap {

	Map<Integer,String> map;
	
	SortMap()
	{
		map = new HashMap<Integer, String>();
	}
	
	public void addValues()
	{
		map.put(10, "A");
		map.put(1, "B");
		map.put(5, "C");
		map.put(2, "D");
		map.put(4, "E");
	}
	
	public void sortByKeys()
	{
		TreeMap<Integer,String> tm = new TreeMap<Integer,String> (map);  
		Iterator<Integer> itr = tm.keySet().iterator();
		while(itr.hasNext())
		{
			int key=(int)itr.next();  
			System.out.println(key+"->"+map.get(key));  
		}
		System.out.println();
	}
	
	public void sortByValues()
	{
		Map<Integer,String> hm = map.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue()) // sort by values (Strings)
        .collect(
            LinkedHashMap::new,               // keep sorted order
            (m, e) -> m.put(e.getKey(), e.getValue()),
            Map::putAll
        );
		
		hm.forEach((k,v)->System.out.println(k+"->"+v));
		System.out.println();
		
	}
}
