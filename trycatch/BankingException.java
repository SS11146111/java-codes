package com.sangita.trycatch;

class InsufficientBalanceException extends RuntimeException
{
	InsufficientBalanceException(String str)
	{
		super(str);
	}
}

public class BankingException 
{
	private double balance;
	
	public void displayBalance()
	{
		System.out.println("Balance: "+balance);
	}
	
	public void withdraw(double amount)
	{
		if(balance < amount)
		{
			throw new InsufficientBalanceException("Withdraw unsuccesful: Insufficient balance!!");
		}
		else
		{
			balance-=amount;
			System.out.println("Amount withdrawn: "+amount);
			displayBalance();
		}
	}
	
	public void deposit(double amount)
	{
		balance+=amount;
		System.out.println("Amount deposited: "+amount);
		displayBalance();
	}
	
}
