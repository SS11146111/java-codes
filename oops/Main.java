package com.sangita.oops;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Car obj = new Car("Civic", "Honda", "2025"); System.out.println(obj);
		 */

		/*
		 * Student obj1 = new Student("Sangita","B16CS011","Computer Science"); Student
		 * obj2 = new Student("Sheldon","B16CS012","Physics"); Student obj3 = new
		 * Student("Penny","B16CS013","Arts"); obj1.display(); obj2.display();
		 * obj3.display();
		 */
		
		
		/*
		 * BankAccount obj = new BankAccount(); obj.withdraw(100); obj.deposit(500);
		 * obj.withdraw(270);
		 */
		
		/*
		 * List<Book> obj = new ArrayList<Book>();
		 * 
		 * Book b1 = new Book("Pride and Prejudice","Jane Austin","1"); Book b2 = new
		 * Book("The Stand", "Stephen King", "2"); Book b3 = new
		 * Book("Angels and Demons", "Tom Hanks", "3");
		 * 
		 * obj.add(b1); obj.add(b2); obj.add(b3);
		 * 
		 * for(Book b: obj) { System.out.println(b); }
		 * 
		 * System.out.println();
		 * 
		 * obj.remove(b2);
		 * 
		 * for(Book b: obj) { System.out.println(b); }
		 */
		
		/*
		 * MethodCalculator obj1 = new MethodCalculator(2,4,'+'); MethodCalculator obj2
		 * = new MethodCalculator(8,4,'-'); MethodCalculator obj3 = new
		 * MethodCalculator(12,0,'/'); MethodCalculator obj4 = new
		 * MethodCalculator(7,4,'*'); MethodCalculator obj5 = new
		 * MethodCalculator(5,0,'%'); obj1.select(); obj2.select(); obj3.select();
		 * obj4.select(); obj5.select();
		 */
		
		/*
		 * TemperatureConverter obj = new TemperatureConverter(50); obj.celciusToFah();
		 */
		
		/*
		 * OverloadedConstructors obj1 = new OverloadedConstructors();
		 * OverloadedConstructors obj2 = new OverloadedConstructors("Sangita");
		 * OverloadedConstructors obj3 = new OverloadedConstructors("Sangita", "Saha");
		 * OverloadedConstructors obj4 = new OverloadedConstructors(obj2);
		 */
		
		/*
		 * Employee emp = new Employee("Sangita", "PC", "SSPC112"); emp.display();
		 * emp.setName("Sangita Saha"); emp.setPosition("Software Engineer");
		 * emp.setId("SSSE113"); emp.display();
		 */
		
		/*
		 * SecureBalance obj = new SecureBalance(); obj.withdraw(100); obj.deposit(500);
		 * obj.withdraw(270);
		 */
		
		/*
		 * Vehicle vehicle = new Vehicle(); Bike bike = new Bike(); Car1 car = new
		 * Car1();
		 * 
		 * vehicle.start(); bike.start(); car.start();
		 */
		
		/*
		 * Shape shape = new Shape(); Circle circle = new Circle(2); Rectangle rectangle
		 * = new Rectangle(2,4); Triangle triangle = new Triangle(2,4);
		 * 
		 * shape.area(); circle.area(); rectangle.area(); triangle.area();
		 */
		 
		MethodOverloading obj = new MethodOverloading();
		obj.print();
		obj.print("Sangita");
		obj.print("Sangita","Saha");
		
	}

}
