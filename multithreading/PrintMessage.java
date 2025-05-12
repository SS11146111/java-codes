package com.sangita.multithreading;

public class PrintMessage extends Thread {

	public void run()
	{
		int counter = 1;
		
		while(counter<=5)
		{
			System.out.println("Hi");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
			counter++;
		}
	}
}
