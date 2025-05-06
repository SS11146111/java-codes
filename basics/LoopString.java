package com.sangita.basics;

public class LoopString {
	
	private String str;
	
	LoopString(String str)
	{
		this.str = str.toUpperCase();
	}
	
	public void loopThough()
	{
		int i;
		
		for( i=0;i<str.length();i++)
		{
			if(		str.charAt(i) == 'A' || 
					str.charAt(i) == 'E' ||
					str.charAt(i) == 'I' ||
					str.charAt(i) == 'O' ||
					str.charAt(i) == 'U')
			{
				System.out.print("Found a vowel at "+(i+1));
				break;
			}
			
				
		}
		
		
	}
}
