package com.sangita.collections;

import java.util.*;

public class ListIteratorDemo {
	
	List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	
	public void displayForward()
	{
		int result;
		
		ListIterator<Integer> itr = list.listIterator();
	    while (itr.hasNext()) {
	    	result = itr.next()*2;
	        System.out.print(result + " ");
	    }
	    System.out.println();
	}
	
	public void displayBackward()
	{
		int result;
		
		ListIterator<Integer> itr = list.listIterator(list.size());
	    while (itr.hasPrevious()) {
	    	result = itr.previous()*3;
	        System.out.print(result + " ");
	    }
	    System.out.println();
	}


}
