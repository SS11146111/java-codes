package com.sangita.collections;
import java.time.LocalDate;
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
		
		/*
		 * ToDoList demo = new ToDoList(); demo.addTask("Change sheets", "Not done");
		 * demo.addTask("Buy groceries", "Not done"); demo.addTask("Do laundry",
		 * "Not done"); demo.display(); demo.changeStatus(3, "Started"); demo.display();
		 * demo.removeTask(2); demo.display();
		 */
		
		/*
		 * HashSetDemo demo = new HashSetDemo(); demo.addElement(2); demo.addElement(3);
		 * demo.addElement(1); demo.addElement(2); demo.display();
		 * demo.removeElement(2); demo.display(); demo.containElement(3);
		 */
		
		/*
		 * SetOperations demo = new SetOperations(); demo.union(); demo.intersection();
		 * demo.difference();
		 */
		
		/*
		 * SortTreeSet demo = new SortTreeSet(); demo.display();
		 */
		
		/*
		 * EmployeeCollection demo = new EmployeeCollection();
		 * demo.add("Sangita","SE","112"); demo.add("Rahul","PC","121");
		 * demo.add("Sangita","SE","112"); demo.retrieve();
		 */
		
		/* CompareSets.compareTime(); */
		
		
		/*
		 * WordCounter demo = new WordCounter(); demo.wordCounter();
		 */
		
		/*
		 * SuperSet demo = new SuperSet(); demo.checkSuperSet();
		 */
		
		/*
		 * CustomSorting demo = new CustomSorting(); demo.display();
		 */
		
		/*
		 * SortTreeSetDesc demo = new SortTreeSetDesc(); demo.display();
		 */
		
		/*
		 * MapDemo1 demo = new MapDemo1(); demo.addPairs(); demo.display();
		 * demo.removePairs(99); demo.display();
		 */
		
		/*
		 * CharacterCounter demo = new CharacterCounter("My name is Sangita Saha");
		 * demo.characterCounter();
		 */
		
		/*
		 * MapDemo2 demo = new MapDemo2(); demo.addEmployees(); demo.retrieveName(3);
		 * demo.retrieveName(1); demo.retrieveName(6);
		 */
		
		/*
		 * SortMap demo = new SortMap(); demo.addValues(); demo.sortByKeys();
		 * demo.sortByValues();
		 */
		
		/*
		 * PhoneBook demo = new PhoneBook(); demo.addRecord("Sangita", 8415915934L);
		 * demo.addRecord("Saha", 8258030240L); demo.addRecord("Ashok", 8794169708L);
		 * demo.addRecord("Pranab", 9436785884L); demo.addRecord("Lipika", 9436725173L);
		 * 
		 * demo.display();
		 * 
		 * demo.getRecord("Pran");
		 */
		
		/*
		 * FindDuplicates demo = new FindDuplicates(); demo.storeCount();
		 */
		
		/*
		 * MapEquality demo = new MapEquality(); demo.testEquality();
		 */
		
		/*
		 * DateEventMap demo = new DateEventMap();
		 * demo.addRecord(LocalDate.of(1947,8,15),"Independence Day");
		 * demo.addRecord(LocalDate.of(2024,1,1) , "New Year");
		 * demo.addRecord(LocalDate.of(1972,9,17), "Mom's Birthday");
		 * demo.addRecord(LocalDate.of(1964,7,6) , "Dad's Birthday");
		 * demo.addRecord(LocalDate.of(1997,8,21), "My Birthday");
		 * 
		 * demo.display();
		 * 
		 * demo.retrieveRecord(LocalDate.of(1972,9,17));
		 * 
		 * demo.updateRecord(LocalDate.of(1997,8,21),"Sangita's Birthday");
		 * 
		 * demo.display();
		 * 
		 * demo.deleteRecord(LocalDate.of(1947, 8, 15));
		 * 
		 * demo.display();
		 */
		
		/*
		 * GroupAnagrams demo = new GroupAnagrams(); String[] words = {"bat", "tab",
		 * "rat", "tar", "art", "cat"}; demo.groupAnagrams(words);
		 */
		
		/*
		 * TaskScheduler scheduler = new TaskScheduler();
		 * scheduler.addTask("Email client", 2); scheduler.addTask("Backup database",
		 * 1); scheduler.addTask("Clean temp files", 3); scheduler.runTasks();
		 */
		
		/*
		 * PrintQueue simulator = new PrintQueue();
		 * 
		 * simulator.addJob("Report.pdf"); simulator.addJob("Invoice.docx");
		 * simulator.addJob("Presentation.pptx");
		 * 
		 * System.out.println("\n--- Start Printing ---\n"); simulator.processJobs();
		 */
		
		/*
		 * DequePalindrome demo = new DequePalindrome("mom"); demo.check();
		 */
		
		/*
		 * DequeStack demo = new DequeStack(); demo.add(2); demo.add(4); demo.add(7);
		 * demo.add(3); demo.add(5);
		 * 
		 * demo.display();
		 * 
		 * demo.add(10);
		 * 
		 * demo.display();
		 * 
		 * demo.remove();
		 * 
		 * demo.display();
		 * 
		 * demo.remove(); demo.remove(); demo.remove(); demo.remove(); demo.remove();
		 * 
		 * demo.remove(); demo.display();
		 */
		
		/*
		 * BrowserHistory demo = new BrowserHistory("home.com");
		 * demo.visit("www.google.com"); demo.visit("www.facebook.com");
		 * demo.visit("www.discord.com"); demo.visit("www.github.com");
		 * 
		 * demo.forward(); demo.back(); demo.back(); demo.forward();
		 */
		
		/*
		 * PriorityQueue<Job> jobQueue = new PriorityQueue<>();
		 * 
		 * jobQueue.offer(new Job("Email Processing", 3)); jobQueue.offer(new
		 * Job("Data Backup", 1)); jobQueue.offer(new Job("Report Generation", 2));
		 * 
		 * System.out.println("Processing jobs by priority:\n"); while
		 * (!jobQueue.isEmpty()) { System.out.println(jobQueue.poll()); }
		 */
		
		
		/*
		 * TicketCounter counter = new TicketCounter();
		 * 
		 * counter.cutTicket("Alice"); counter.cutTicket("Bob");
		 * counter.cutTicket("Charlie");
		 * 
		 * counter.displayList();
		 * 
		 * System.out.println("Using tickets..."); counter.useTicket(); // Alice
		 * counter.useTicket(); // Bob counter.useTicket(); // Charlie
		 * counter.useTicket(); // All tickets used
		 */	
		}

}
