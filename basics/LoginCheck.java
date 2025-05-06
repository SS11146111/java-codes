package com.sangita.basics;
import java.util.Scanner;

public class LoginCheck {
	
	private String username;
	private String password;
	
	LoginCheck()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username: ");
		this.username = sc.next();
		System.out.println("Enter the password: ");
		this.password = sc.next();
		sc.close();
	    
	}
	
	
	public boolean check()
	{
		if(username.equals("Sangita") && password.equals("Abcde123"))
			return true;
		else
			return false;
	}
	
	public void welcome()
	{
		if(check() == true)
			System.out.println("Welcome "+username);
		else
			System.out.println("Invalid credentials");
			
	}

}
