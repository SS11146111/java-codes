package com.sangita.collections;

import java.util.*;

public class SuperSet {
	
	 Set<String> setA = new HashSet<>(Arrays.asList("apple","banana"));
     Set<String> setB = new HashSet<>(Arrays.asList("apple","banana","cherry"));

     public void checkSuperSet()
     {
    	 if(setA.containsAll(setB) && !setA.equals(setB))
    	 {
    		 System.out.println("SetA is superset of SetB");
    	 }
    	 else if(setB.containsAll(setA) && !setA.equals(setB))
    	 {
    		 System.out.println("SetB is superset of SetA");
    	 }
    	 else if(setA.equals(setB))
    	 {
    		 System.out.println("SetA and SetB are equal");
    	 }
     }
}
