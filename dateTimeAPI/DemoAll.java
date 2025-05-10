package com.sangita.dateTimeAPI;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DemoAll {
	
	public void call1()
	{
		LocalDate date = LocalDate.now();
		System.out.println("Date: "+date);
		LocalTime time = LocalTime.now();
		System.out.println("Time: "+time);
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Date-Time: "+dateTime);
		
	}
	
	public void call2()
	{
		String pattern = "dd-MM-yyyy";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		System.out.println(formatter.format(LocalDate.now()));
	
	}
	
	public void call3()
	{
		String str = "2016-08-21";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(formatter.format(LocalDate.parse(str)));
	}
	
	public void call4()
	{
		LocalDate date = LocalDate.now();
		LocalDate yesterday = date.minusDays(1);
		LocalDate tomorrow = date.plusDays(1);
		LocalDate monthBefore = date.minusMonths(1);
		LocalDate monthAfter = date.plusMonths(1);
		LocalDate yearBefore = date.minusYears(1);
		LocalDate yearAfter = date.plusYears(1);
		
		System.out.println("Current date: "+date);
		System.out.println("Yesterday: "+yesterday);
		System.out.println("Tomorrow: "+tomorrow);
		System.out.println("Month Before: "+monthBefore);
		System.out.println("Month After: "+monthAfter);
		System.out.println("Year Before: "+yearBefore);
		System.out.println("Year After: "+yearAfter);
	}
	
	public void call5()
	{
		LocalDate date = LocalDate.now();
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		int dayOfMonth = date.getDayOfMonth();
		int dayOfYear = date.getDayOfYear();
		System.out.println("Day of the week = "+dayOfWeek);
		System.out.println("Day of the month = "+dayOfMonth);
		System.out.println("Day of the year = "+dayOfYear);
	}
	
	public void call6()
	{
		LocalDate date1 = LocalDate.of(2025, 06, 10);
		LocalDate date2 = LocalDate.of(2025, 05, 12);
		if(date1.isBefore(date2))
		{
			System.out.println(date1);
		}
		else
		{
			System.out.println(date2);
		}
		
	
	}
	
	public void call7()
	{
		LocalDate date1 = LocalDate.of(2025, 05, 10);
		LocalDate date2 = LocalDate.of(2025,  05, 15);
		System.out.println(ChronoUnit.DAYS.between(date1,date2));
	}
	
	public void call8(LocalDate born)
	{
		LocalDate present = LocalDate.now();
		if (born.isAfter(present)) {
		    System.out.println("Date of birth cannot be in the future.");
		    return;
		}
		Period age = Period.between(born, present);
		System.out.println("Age = "+age.getYears()+" years "+age.getMonths()+" months "+age.getDays()+" days ");
	}
	
	public void call9(LocalDate date)
	{
		if(date.isLeapYear())
		{
			System.out.println(date.getYear()+" is a leap year");
		}
		else
		{
			System.out.println(date.getYear()+" is not a leap year");
		}
	}
	
	public void call10(LocalDate date)
	{
		LocalDate present = LocalDate.now();
		if(date.isAfter(present))
		{
			System.out.println(date+" is after today");
		}
		else if(date.isBefore(present))
		{
			System.out.println(date+" is before today");
		}
		
	}
	
	
}
