package com.sangita.java8;
import java.util.*;

class Name
{
	private String name;
	
	Name(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
}

public class OptionalDemo1 {

	List<Name> list = new ArrayList<Name>();
	
	public void addObjects()
	{
		list.add(new Name("sangita"));
		list.add(new Name(null));
		list.add(new Name("Jane"));
		
	}
	
	public void getLength()
	{
		for(Name i : list)
		{
			String str = i.getName();
			Optional<String> checkNull = Optional.ofNullable(str);  
			if(checkNull.isPresent())
			{
				System.out.println(str+"->"+str.length());
			}
			else
			{
				 System.out.println("Value is not present");  
			}
		}
	}
	
}
