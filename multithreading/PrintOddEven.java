package com.sangita.multithreading;

public class PrintOddEven {
	
	int counter = 1;
	static int NUM;
	
	public void displayOddNumbers() {
		
		synchronized(this)
		{
			while (counter < NUM)   
			{  
			
				while (counter % 2 == 0)   
				{  
			  
					try   
					{  
						wait();  
					}  
					catch (InterruptedException ex)   
					{  
						ex.printStackTrace();  
					} 
				}
				
				System.out.print(counter + " ");  
				counter = counter+1;
				notify();
			}
		}
	}
	
	
	public void displayEvenNumbers() {
		
		synchronized(this)
		{
			while (counter < NUM)   
			{  
			
				while (counter % 2 == 1)   
				{  
			  
					try   
					{  
						wait();  
					}  
					catch (InterruptedException ex)   
					{  
						ex.printStackTrace();  
					} 
				}
				
				System.out.print(counter + " ");  
				counter = counter+1;
				notify();
			}
		}
	}
	

}
