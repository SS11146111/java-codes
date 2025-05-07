package com.sangita.trycatch;

import java.util.Scanner;

public class ScannerTest {
	
	public void method()
	{
		Scanner sc = null;
		try
		{
			sc = new Scanner(System.in);
			String str = sc.next();
			System.out.println(str);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			if(sc!=null)
			{
				sc.close();
			}
			System.out.println("Scanner closed");
		}
	}

}
