package com.sangita.collections;
import java.util.*;

public class MapDemo2 {
	
	Map<Integer,String> map;
	
	MapDemo2()
	{
		map = new HashMap<Integer, String>();
	}
	
	public void addEmployees()
	{
		map.put(1,"A");
		map.put(2,"B");
		map.put(3,"C");
		map.put(4,"D");
		map.put(5,"E");
	}
	
	public void retrieveName(int id)
	{
		System.out.println(map.get(id));
	}

}
