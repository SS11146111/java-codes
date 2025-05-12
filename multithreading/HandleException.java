package com.sangita.multithreading;

public class HandleException  extends Thread{

	public void run()
	{
		try 
		{
			System.out.println("Thread is sleeping ...");
			Thread.sleep(10000);
		} 
		catch (InterruptedException e) 
		{
			System.out.println("Thread interrupted...");
			
		}
	}
	
}
