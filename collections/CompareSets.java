package com.sangita.collections;
import java.util.*;

public class CompareSets {
	
	    public static void compareTime() {
	        int size = 100_000;

	        // HashSet timing
	        Set<Integer> hashSet = new HashSet<>();
	        long startHashSet = System.nanoTime();
	        for (int i = 0; i < size; i++) {
	            hashSet.add(i);
	        }
	        long endHashSet = System.nanoTime();
	        System.out.println("HashSet insertion time: " + (endHashSet - startHashSet) / 1_000_000 + " ms");

	        // TreeSet timing
	        Set<Integer> treeSet = new TreeSet<>();
	        long startTreeSet = System.nanoTime();
	        for (int i = 0; i < size; i++) {
	            treeSet.add(i);
	        }
	        long endTreeSet = System.nanoTime();
	        System.out.println("TreeSet insertion time: " + (endTreeSet - startTreeSet) / 1_000_000 + " ms");
	    }
}
