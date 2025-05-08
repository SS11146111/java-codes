package com.sangita.collections;

import java.util.*;

public class DequeStack {
	
	Deque<Integer> stack = new ArrayDeque<Integer>();

	public void add(int ele)
	{
		stack.offerLast(ele);
	}
	
	public void remove()
	{
		 Integer removed = stack.pollLast(); // or stack.pop();
	        if (removed == null) {
	            System.out.println("Stack is empty.");
	        }
	}
	
	public void display()
	{
		stack.forEach(e->System.out.print(e+" "));
		System.out.println();
	}
}
