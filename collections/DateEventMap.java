package com.sangita.collections;

import java.time.LocalDate;
import java.util.*;

public class DateEventMap {

	Map<LocalDate,String> map = new TreeMap<LocalDate,String>();
	
	public void addRecord(LocalDate d1, String event)
	{
		map.put(d1, event);
	}
	
	public void retrieveRecord(LocalDate d1)
	{
		System.out.println(d1+"->"+map.get(d1));
		System.out.println();
	}
	
	public void updateRecord(LocalDate d1, String event)
	{
		map.replace(d1, event);
	}
	
	public void deleteRecord(LocalDate d1)
	{
		map.remove(d1);
	}
	public void display()
	{
		
		map.forEach((k,v)->System.out.println(k+"->"+v));
		System.out.println();
	}
	
}
