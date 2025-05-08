package com.sangita.collections;

import java.util.*;

public class WordCounter {
	
	private String str;
	Set<String> counter = new TreeSet<String>();
	Map<String, Integer> frequency = new HashMap<String, Integer>();
	
	WordCounter()
	{
		//str = "Hi Java , how are you you Java , Hi friend Java";
		str = "sangita sangita Sangita java Java Hi how How how are you you are are";
	}
	
	public void wordCounter()
	{
		String[] words = str.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");
		for(String i : words)
		{
			counter.add(i);
			frequency.merge(i, 1, Integer::sum);
		}
		
		counter.forEach(e-> System.out.println(e+":"+frequency.get(e)));
	}
	
}
