package com.sangita.multithreading;

public class PrintNumbers extends Thread{
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}

}
