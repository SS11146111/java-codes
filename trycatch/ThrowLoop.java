package com.sangita.trycatch;

import java.io.IOException;

public class ThrowLoop {

	public void breakWithThrow() throws IOException
	{
		for(int i=1;i<=5;i++)
		{
			if(i==3)
			{
				throw new IOException("device error");
			}
			else
			{
				System.out.println(i+" ");
			} 
		}
	}
}
