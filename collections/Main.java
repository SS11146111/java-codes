package com.sangita.collections;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		/*
		 * AddRemoveArrayList demo = new AddRemoveArrayList(); for(int i =1;i<=10;i++) {
		 * demo.addElement(i); }
		 * 
		 * demo.display(); demo.removeElement(2); demo.display(); demo.removeElement(6);
		 * demo.display();
		 */
		
		/*
		 * RemoveDuplicatesList demo = new RemoveDuplicatesList(); demo.displayList();
		 * demo.removeDuplicates();
		 */
		
		/*
		 * ReverseArrayList demo = new ReverseArrayList(); demo.reverse();
		 */
		
		/*
		 * List<SortStudent> list = new ArrayList<SortStudent>(); list.add(new
		 * SortStudent("A",78)); list.add(new SortStudent("D",89)); list.add(new
		 * SortStudent("E",56)); list.add(new SortStudent("C",80)); list.add(new
		 * SortStudent("B",54)); list.add(new SortStudent("F",99));
		 * 
		 * list.sort(Comparator.comparingDouble(SortStudent::getMarks));
		 * list.forEach(System.out::println);
		 */
		
		/*
		 * MergeArrayList demo = new MergeArrayList(); demo.addElements(); demo.merge();
		 */
		
		/*
		 * RetainAll demo = new RetainAll(); demo.addElements(); demo.retainAll();
		 */
		
		/*
		 * ConvertBetweenLists demo = new ConvertBetweenLists();
		 * demo.ArrayListToLinkedList(); System.out.println();
		 * demo.LinkedListToArrayList();
		 */
		
		/*
		 * FIFOLinkedList demo = new FIFOLinkedList(); demo.add(11); demo.add(12);
		 * demo.add(13); demo.remove(); demo.remove();
		 */
		
		/*
		 * ListIteratorDemo demo = new ListIteratorDemo(); demo.displayForward();
		 * demo.displayBackward();
		 */
		
		ToDoList demo = new ToDoList();
		demo.addTask("Change sheets", "Not done");
		demo.addTask("Buy groceries", "Not done");
		demo.addTask("Do laundry", "Not done");
		demo.display();
		demo.changeStatus(3, "Started");
		demo.display();
		demo.removeTask(2);
		demo.display();
		
	}

}
