package com.sangita.java8;
import java.util.*;

public class OptionalDemo2 {

	List<String> list;
	
	OptionalDemo2()
	{
		list = new ArrayList<String>();
		list.add("Sangita");
		list.add(null);
		list.add("Kiwi");
		list.add(null);
	}
	
	public void checkIfPresent()
	{
		for(String i : list)
		{
			Optional<String> obj = Optional.ofNullable(i);
			if(obj.isPresent())
			{
				System.out.println(obj.get());
			}
			else
			{
				System.out.println("-");
			}
		}
		
	}
}
