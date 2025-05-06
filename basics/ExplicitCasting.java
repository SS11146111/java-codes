package com.sangita.basics;

public class ExplicitCasting {

		
		private double num;
		private int value;
		
		ExplicitCasting(double num)
		{
			this.num = num;
		}
		
		public void casting()
		{
			value = (int)num;
			System.out.println("double -> int: "+ num +"->"+ value);
		}

}
