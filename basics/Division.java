package com.sangita.basics;

import java.text.DecimalFormat;

public class Division {

	private int num1,num2;
	
	Division(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void divide()
	{
		double result = (double)num1/num2;
		DecimalFormat df_obj = new DecimalFormat("#.###");
		System.out.println(df_obj.format(result));
	}
}
