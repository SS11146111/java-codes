package com.sangita.collections;
import java.util.*;

public class FindDuplicates {

	List<Integer> list; 
	Map<Integer,Integer> map;
	
	FindDuplicates()
	{
		list = new ArrayList<Integer>(Arrays.asList(1,1,2,3,3,3,4,5));
		map  = new HashMap<Integer,Integer>();
	}
	
	public void storeCount()
	{
		for(int i : list)
		{
			map.merge(i, 1, Integer::sum);
		}
		
		map.forEach((k,v) -> {
		
			if(v>1)
			System.out.println(k+"->"+v);
			
		});
			
	}
}
