package com.sangita.java8;

public class RunnableLambda {

	public void call()
	{
		Runnable r1=()->{  
            System.out.println("Thread1 is running...");  
		};  
		Thread t1=new Thread(r1);  
		t1.start();
	}
}
