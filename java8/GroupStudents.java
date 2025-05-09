package com.sangita.java8;
import java.util.*;
import java.util.stream.Collectors;

class Student
{
	private String name;
	private char grade;
	
	Student(String name, char grade)
	{
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return name;
	}
	
}


public class GroupStudents {

	List<Student> list1;
	
	Map<Character, List<Student>> grouped;
	
	GroupStudents()
	{
		list1 = new ArrayList<Student>();
		list1.add(new Student("Sangita",'A'));
		list1.add(new Student("Rahul",'B'));
		list1.add(new Student("Yohan",'C'));
		list1.add(new Student("Nysa",'A'));
		list1.add(new Student("Aranya",'B'));
		list1.add(new Student("Ved",'C'));
	}
	
	
	public void groupStudents()
	{
		grouped = list1.stream().collect(Collectors.groupingBy(Student::getGrade));
	}
	
	public void display()
	{
		for(Map.Entry<Character,List<Student>> m : grouped.entrySet())
		{
			System.out.println(m.getKey()+"->"+m.getValue());
		}
	}
	
	
	
}
