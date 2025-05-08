package com.sangita.collections;
import java.util.*;

class Ticket
{
	String name;
	
	Ticket(String name)
	{
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ticket = " + name;
	}
	
	
}
public class TicketCounter {

	Deque<Ticket> ticketCounter = new LinkedList<Ticket>();

	public void cutTicket(String name)
	{
		ticketCounter.offerLast(new Ticket(name));
	}
	
	public void useTicket()
	{
		Ticket t = ticketCounter.pollFirst();
		if(t==null)
		{
			System.out.println("All tickets used...");
		}	
		else
		{
			System.out.println(t);
		}
	}
	
	public void displayList()
	{
		System.out.println("All tickets ...");
		ticketCounter.forEach(t -> System.out.println(t));
		System.out.println();
	}
	
}
