package com.sangita.basics;

public class GradeCalculator {
	
	private double marks;
	
	GradeCalculator(double marks)
	{
		this.marks = marks;
	}
	
	public char grade()
	{
		if(marks>=90)
		{
			return 'A';
		}
		else if(marks>=80 && marks<90)
		{
			return 'B';
		}
		else if (marks>=70 && marks<80)
		{
			return 'C';
		}
		else if(marks>=60 && marks<70)
		{
			return 'D';
		}
		else
		{
			return 'E';
		}
		
	}
	
	public void display()
	{
		System.out.println("Grade = "+ grade());
	}
}
