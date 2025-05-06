package com.sangita.basics;

import java.util.Scanner;

public class OddEven {
	
	private int num;
	
	OddEven()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		this.num = sc.nextInt();
		sc.close();
	}

	public int check()
	{
		if(num%2==0)
			return 1;
		else
			return 0;
					
	}
	
	public void display()
	{
		if(check() == 1)
			System.out.println(num +" is even");
		else
			System.out.println(num +" is odd");
	}
}
