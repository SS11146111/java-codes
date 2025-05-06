package com.sangita.oops;

public class SecureBalance {


	private double balance;
	
	
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount)
	{
		setBalance(getBalance()+amount);
		System.out.println("Deposit successful!!");
		display();
	}
	
	public void withdraw(double amount)
	{
		if(amount>getBalance())
			System.out.println("Insufficient balance!!");
		else
		{
			setBalance(getBalance()-amount);
			System.out.println("Withdraw successful!!");
		}
		display();
	}
	
	public void display()
	{
		System.out.println("Current balance: "+getBalance());
	}
}
