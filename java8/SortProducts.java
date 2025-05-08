package com.sangita.java8;
import java.util.*;

class Product
{
	String name;
	double price;
	
	Product(String name, double price)
	{
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	
}

public class SortProducts {

	List<Product> list = new ArrayList<Product>();
	
	public void addProducts()
	{
		list.add(new Product("Headphones",3000));
		list.add(new Product("Airpods", 4500));
		list.add(new Product("Glasses", 7000));
	}
	
	public void toSort()
	{
		Collections.sort(list, (p1,p2)->{return p1.name.compareTo(p2.name);});
	}
	
	public void display()
	{
		list.forEach(p->System.out.println(p));
	}
}
