package com.sangita.collections;
import java.util.*;
public class ConvertBetweenLists {
	
	public void ArrayListToLinkedList()
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		LinkedList<Integer> list2 = new LinkedList<Integer>(list1);
		
		list2.forEach(e->System.out.print(e+"->"));
	}
	
	public void LinkedListToArrayList()
	{
		LinkedList<Integer> list3 = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
		ArrayList<Integer> list4 = new ArrayList<Integer>(list3);
		list4.forEach(e->System.out.print(e+","));
	}
	

}
