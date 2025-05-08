package com.sangita.collections;
import java.util.*;

public class DequePalindrome {
	
	Deque<Character> queue = new ArrayDeque<>();
	
	DequePalindrome(String word)
	{
		char[] arr = word.toCharArray();
		for(char i : arr)
		{
			queue.offerLast(i);
		}
	}
	
	public void check()
	{
		int flag=0;
		while(!queue.isEmpty())
		{
			if(queue.peekFirst() != queue.peekLast())
			{
				flag=1;
				break;
			}
			queue.pollFirst();
			if(!queue.isEmpty())
				queue.pollLast();
		}
		
		if(flag==1)
			System.out.println("Not a palindrome");
		else
			System.out.println("It is a palindrome");
	}

}
