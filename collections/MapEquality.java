package com.sangita.collections;
import java.util.*;

public class MapEquality {

	public void testEquality()
	{
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("a", 1);
		map1.put("b", 2);

		Map<String, Integer> map2 = new HashMap<>();
		map2.put("b", 2);
		map2.put("a", 1);
		//map2.put("c", 3);

		System.out.println(map1.equals(map2));
	}
	
}
