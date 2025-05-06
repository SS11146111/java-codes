package com.sangita.basics;

public class PrintLoops {
	
	public void forLoop()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
	}
	
    public void whileLoop()
    {
    	int i=1;
    	while(i<=10)
    	{
    		
    		System.out.print(i+" ");
    		i++;
    	}
    }
    
    public void doWhileLoop()
    {
    	int i=1;
    	do {
    		
    		System.out.print(i+" ");
    		i++;
    	}
    	while(i<=10);
    }
    
    public void display()
    {
    	forLoop();
    	System.out.println();
    	whileLoop();
    	System.out.println();
    	doWhileLoop();
    	
    }
}
