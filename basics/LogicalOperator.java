package com.sangita.basics;

public class LogicalOperator {

		private int age;
		private boolean citizenship;
		
		LogicalOperator(int age, boolean citizenship)
		{
			this.age = age;
			this.citizenship = citizenship;
		}
		
		public void check()
		{
			if(age>=18 && citizenship == true)
				System.out.println("Eligible to vote");
			else if(age<18 || citizenship == false)
				System.out.println("Not eligible to vote");
		}
}
