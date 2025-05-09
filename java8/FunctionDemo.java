package com.sangita.java8;
import java.util.*;
import java.util.stream.Collectors;


public class FunctionDemo {
	
	public void convert()
	{
		Function<String, Integer> sL = str -> str.length();
	
		List<String> list = List.of("apple", "banana", "orange", "kiwi", "strawberry");
		
		List<Integer> lengths = list.stream().map(s->sL.apply(s)).collect(Collectors.toList());
	
		lengths.forEach(l -> System.out.print(l+" "));
	}
}
