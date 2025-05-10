package com.sangita.java8;

import java.util.Optional;

public class OptionalDemo5 {
	public void call(String s)
	{	
		String result = Optional.ofNullable(s).map(String::toUpperCase).orElse("VALUE NOT PRESENT");
		System.out.println(result); 
	}
}
