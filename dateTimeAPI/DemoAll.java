package com.sangita.dateTimeAPI;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Set;

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
	
	public void call11()
	{
		LocalDateTime  ldt = LocalDateTime.now();  
	    ZoneId  india = ZoneId.of("Asia/Kolkata");   
	    ZonedDateTime zone1  = ZonedDateTime.of(ldt, india);   
	    System.out.println("In India Central Time Zone: " + zone1);  
	    ZoneId  tokyo = ZoneId.of("Asia/Tokyo");   
	    ZonedDateTime zone2   = zone1.withZoneSameInstant(tokyo);   
	    System.out.println("In Tokyo Central Time Zone: "  + zone2);  
	}
	
	public void call12()
	{
		LocalDateTime  ldt = LocalDateTime.now();  
	    ZoneId  india = ZoneId.of("Asia/Kolkata");   
	    ZonedDateTime zone1  = ZonedDateTime.of(ldt, india);   
	    System.out.println("In India Central Time Zone: " + zone1);  
	}
	
	public void call13()
	{
		 java.util.Date dt1 = new java.util.Date();  
		 LocalDateTime dt2 = dt1.toInstant()
                 .atZone(ZoneId.systemDefault())
                 .toLocalDateTime();
		 System.out.println("Date -> LocalDateTime: "+ dt2);
		 
		 
		 LocalDateTime dt3 = LocalDateTime.of(LocalDate.of(2025, 01, 12), LocalTime.of(17, 15, 00));
		 java.util.Date dt4 = java.util.Date.from(dt3.atZone(ZoneId.systemDefault()).toInstant());
		 System.out.println("LocalDateTime->Date: "+ dt4);
		 
	}
	
	
	public void call14()
	{
		
		Set<String> set = ZoneId.getAvailableZoneIds();
		for(String i : set)
		{
			System.out.println(i);
			
		}
		
	}
	
	public void call15()
	{
		ZonedDateTime tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Tokyo Time: " + tokyoTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z")));

        // Convert Tokyo time to New York time
        ZonedDateTime newYorkTime = tokyoTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("New York Time: " + newYorkTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z")));
   
	}

	public void call16()
	{
		 LocalDateTime now = LocalDateTime.now();
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, MMM d, yyyy HH:mm:ss");
		 String formattedDate = now.format(formatter);
		 System.out.println("Formatted Date-Time: " + formattedDate);
	}
	
	public void call17()
	{
		LocalDateTime now = LocalDateTime.now();
        System.out.println("Original: " + now);

        // Truncate to nearest hour
        LocalDateTime truncatedToHour = now.truncatedTo(ChronoUnit.HOURS);
        System.out.println("Truncated to Hour: " + truncatedToHour);

        // Truncate to nearest minute
        LocalDateTime truncatedToMinute = now.truncatedTo(ChronoUnit.MINUTES);
        System.out.println("Truncated to Minute: " + truncatedToMinute);
	}
	
	public void call18()
	{
		Instant nowUtc = Instant.now();
        System.out.println("Current UTC Timestamp: " + nowUtc);
	}
	
	public void call19()
	{
		 LocalDate today = LocalDate.now();

	        // Adjust to the last day of the month
	     LocalDate lastDay = today.with(TemporalAdjusters.lastDayOfMonth());

	     System.out.println("Today: " + today);
	     System.out.println("Last Day of Month: " + lastDay);
	}
	
	public void call20()
	{
		  LocalDate current = LocalDate.now();

	      System.out.println("Upcoming Mondays:");
	      for (int i = 0; i < 5; i++) 
	      {
	         current = current.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
	         System.out.println(current);
	      }
	}
	
}
