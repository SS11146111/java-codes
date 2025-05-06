package com.sangita.oops;

public class BankAccount {
	
	private double balance;
	
	public void deposit(double amount)
	{
		balance+=amount;
		System.out.println("Deposit successful!!");
		display();
	}
	
	public void withdraw(double amount)
	{
		if(amount>balance)
			System.out.println("Insufficient balance!!");
		else
		{
			balance-=amount;
			System.out.println("Withdraw successful!!");
		}
		display();
	}
	
	public void display()
	{
		System.out.println("Current balance: "+balance);
	}
}
