package com.sangita.java8;

import java.util.Optional;

public class OptionalDemo3 {
	
	public void testOrElse()
	{
		String name = null;
		Optional<String> opt = Optional.ofNullable(name);

		String result = opt.orElse("Default Name");

		System.out.println(result);
	}
	
	public void testOrElseGet()
	{
		String name = null;
		Optional<String> opt = Optional.ofNullable(name);

		// Use a Supplier to compute the default value
		String result = opt.orElseGet(() -> "Generated Default");

		System.out.println(result); 
	}
	

}
