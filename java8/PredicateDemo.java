package com.sangita.java8;
import java.util.*;
import java.util.stream.Collectors;

public class PredicateDemo {

    public void filter() {
       
    	Predicate<Integer> isGT = num -> num > 10;

        List<Integer> numbers = List.of(5, 12, 3, 18, 7, 21);

        // Apply custom predicate
        List<Integer> filtered = numbers.stream()
            .filter(n -> isGT.test(n))
            .collect(Collectors.toList());

        System.out.println("Numbers > 10: " + filtered);
    }
    
}


