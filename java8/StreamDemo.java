package com.sangita.java8;

import java.util.*;

public class StreamDemo {

	List<Integer> list;
	
	StreamDemo()
	{
		list = new ArrayList<Integer>(Arrays.asList(1,6,5,3,7,2,8));
	}
	
	public void sum() 
	{
		
		int result = list.stream().reduce(0, Integer::sum);
		System.out.println("Sum = "+result);
	}
	
	public void average() 
	{
		OptionalDouble result = list.stream().mapToInt(Integer::intValue).average();
		String formatted = String.format("%.2f", result.getAsDouble());
		System.out.println("Average = "+formatted);
	}
	
	public void max()
	{
		int result = list.stream().max((num1, num2)->num1 > num2 ? 1: -1).get(); 
		System.out.println("Max = "+result);
	}
	
	public void min()
	{
		int result = list.stream().min((num1, num2)->num1 > num2 ? 1: -1).get(); 
		System.out.println("Min = "+result);
	}
	
}
