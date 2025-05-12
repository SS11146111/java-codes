package com.sangita.multithreading;

public class ProducerConsumer {
	
	private int arr[] = new int[5];
	private int top = -1;
	
	public synchronized void consume()
	{
		while(top == -1)
		{
			try 
			{
				System.out.println("Buffer empty. Waiting to consume...");
				wait();
			} 
			catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
		}
		
		int element = arr[top];
		System.out.println("Element consumed = "+element);
		top--;
		notify();
	}
	
	
	public synchronized void produce(int element)
	{
		while(top==arr.length-1)
		{
			try 
			{
				System.out.println("Buffer full. Waiting to produce...");
				wait();
			} 
			catch (InterruptedException e) 
			{	
				e.printStackTrace();
			}
		}
		top++;
		arr[top]=element;
		System.out.println("Element produced = " + element);
		
		System.out.print("Current buffer: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        notify();
	}

}
