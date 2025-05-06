package com.sangita.basics;

public class DisplayPrimes {

	
	public void calculate()
	{
		int flag;
		
		for(int a=2;a<=100;a++)
		{
			flag = 0;
			
			for(int i=2;i<=a/2;i++)
			{
				if(a%i == 0)
				{
					flag=1;
					break;
				}
					
			}
		
		if(flag == 0)
			System.out.print(a+" ");
		}
		
	}

}
