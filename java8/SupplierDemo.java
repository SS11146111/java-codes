package com.sangita.java8;

import java.util.*;
import java.util.stream.Stream;

public class SupplierDemo {
	
	public void generate()
	{
		Supplier<Integer> sup = () -> new Random().nextInt(100);
		
		Stream.iterate(1, n -> n + 1)
        .limit(10)
        .forEach(n->System.out.println(sup.get()));
		
	}
	
	
}
