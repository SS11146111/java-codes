package com.sangita.java8;
import java.util.*;

public class ConsumerDemo {
	
	public void print() {
		
		Consumer<String> con = name -> System.out.println(name);
		List<String> list = List.of("apple", "banana", "orange", "kiwi", "strawberry");
		list.stream().forEach(n -> con.accept(n));
	}
	
}
