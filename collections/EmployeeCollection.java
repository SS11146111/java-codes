package com.sangita.collections;

import java.util.*;

class Employee{
	
	String name;
	String position;
	String id;
	
	Employee(String name, String position, String id)
	{
		this.name = name;
		this.position = position;
		this.id = id;
	}
	  // Override equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        return Objects.equals(this.id, other.id);  // assuming id is unique
    }

    // Override hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

	@Override
	public String toString() {
		return "name= " + name + ",| position= " + position + "| id= " + id;
	}
	
    
}

public class EmployeeCollection {

	Set<Employee> emp = new HashSet<Employee>();
	
	public void add(String name, String position, String id)
	{
		Employee e = new Employee(name,position,id);
		if(emp.contains(e))
		{
			
		}
		else
			emp.add(e);
	}
	
	public void retrieve() 
	{
		emp.forEach(e->System.out.println(e));
		
	}
}
