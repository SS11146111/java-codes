package com.sangita.multithreading;

public class BankDemo {

	
   private double balance = 0;
   
   public void deposit(double amount)
   {
	   synchronized(this)
	   {
		   this.balance +=amount;
		   System.out.println("Deposited amount: "+amount+"\n"+"Balance: "+balance);
		   notify();
	   }
	 
	   
   }
   
   public void withdraw(double amount)
   {
	   synchronized(this)
	   {
		   while(this.balance<amount)
		   {
			   try   
				{  
				   System.out.println("Insufficient balance, waiting for deposit...");
				   wait();  
				}  
				catch (InterruptedException ex)   
				{  
					ex.printStackTrace();  
				}
			   
		   }
		   this.balance-=amount;
		   System.out.println("Amount withdrawn: "+amount+"\n"+"Balance: "+balance);
	   }
	   
   }
}
