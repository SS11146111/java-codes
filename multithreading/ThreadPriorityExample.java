package com.sangita.multithreading;

public class ThreadPriorityExample extends Thread   
{  
	    
	public void run()  
	{  
	
		System.out.println("Inside the run() method: "+ Thread.currentThread().getPriority());  
	}  
	  
}

class Test{
	
	public void test()
	{
		ThreadPriorityExample th1 = new ThreadPriorityExample();
		ThreadPriorityExample th2 = new ThreadPriorityExample();
		ThreadPriorityExample th3 = new ThreadPriorityExample();
		
		System.out.println("Priority of the thread th1 is : " + th1.getPriority()); 
		System.out.println("Priority of the thread th2 is : " + th2.getPriority()); 
		System.out.println("Priority of the thread th3 is : " + th3.getPriority()); 
		System.out.println();
		
		th1.setPriority(6);  
		th2.setPriority(3);  
		th3.setPriority(9); 
		
		
		/* System.out.println();
		 * System.out.println("Priority of the thread th1 is : " + th1.getPriority());
		 * System.out.println("Priority of the thread th2 is : " + th2.getPriority());
		 * System.out.println("Priority of the thread th3 is : " + th3.getPriority());
		 * 
		 * System.out.println(); System.out.println("Currently Executing The Thread : "
		 * + Thread.currentThread().getName());
		 * System.out.println("Priority of the main thread is : " +
		 * Thread.currentThread().getPriority());
		 * 
		 * Thread.currentThread().setPriority(10); System.out.println();
		 * System.out.println("Priority of the main thread is : " +
		 * Thread.currentThread().getPriority());
		 */
		
		th1.start();
		th2.start();
		th3.start();
	}

}
