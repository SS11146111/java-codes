package com.sangita.java8;

import java.util.*;

class Employee
{
	String name;
	double salary;
	
	Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
}


public class FilterEmployee {

	List<Employee> list, filtered;
	
	FilterEmployee()
	{
		list = new ArrayList<Employee>();
		list.add(new Employee("Sangita",60000));
		list.add(new Employee("Jasmine",50000));
		list.add(new Employee("Tanuj",70000));
		list.add(new Employee("Rahul", 5000));
		list.add(new Employee("Reshma", 1000));
	}
	
	
	public void filterSalary()
	{
		filtered = list.stream().filter(e->e.salary>50_000).toList();
	}
	
	
	public void display()
	{
		
		filtered.forEach(e->System.out.println(e));
	}
	
	
}
