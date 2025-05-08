package com.sangita.collections;

import java.util.*;

public class PhoneBook {
	
	Map<String,Long> phoneBook ;
	
	PhoneBook()
	{
		phoneBook = new TreeMap<String, Long>();
	}
	
	public void addRecord(String name, Long number)
	{
		phoneBook.put(name, number);
	}
	
	public void getRecord(String name)
	{
		  if (phoneBook.containsKey(name)) {
		        System.out.println(name + " -> " + phoneBook.get(name));
		    } else {
		        System.out.println(name + " not found.");
		    }
	}
	
	public void display() 
	{
		phoneBook.forEach((k,v) -> System.out.println(k+"->"+v));
		System.out.println();
	}
	

}
