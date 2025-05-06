package com.sangita.basics;

public class Vowel {
	
	private char ch;
	
	Vowel(char ch)
	{
		this.ch = Character.toUpperCase(ch);
	}
	
	public String isVowel()
	{
		switch(ch) 
		{
			case 'A': 
			case 'E':
			case 'I':
			case 'O':
			case 'U': return "Vowel";
			default: return "Consonant";
		}
	}
	
	public void display()
	{
		System.out.println(isVowel());
	}

}
