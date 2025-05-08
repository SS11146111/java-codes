package com.sangita.java8;

interface CheckPalindrome
{
	public void check(String str);
}
public class LambdaPalindrome {

	public void call(String s) {
		CheckPalindrome c = (str) -> {
			
			StringBuilder sb = new StringBuilder();
			sb.append(str);
			sb.reverse();
			
			if(str.equals(sb.toString()))
			{
				System.out.println("Palindrome!");
			}
			else
			{
				System.out.println("Not Palindrome!");
			}
		};
		
		c.check(s);
	}
	
}
