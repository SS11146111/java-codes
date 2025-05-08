package com.sangita.collections;

import java.util.*;

class Task{
	
	String task;
	String status;
	
	Task(String task, String status)
	{
		this.task = task;
		this.status = status;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}

public class ToDoList {
	
	List<Task> list = new LinkedList<Task>();
	
	public void addTask(String task, String status)
	{
		Task t = new Task(task,status);
		list.addLast(t);
	}
	
	public void removeTask(int index)
	{
		list.remove(index-1);
	}
	
	public void changeStatus(int index,String status)
	{
		Task t = list.get(index-1);
		t.setStatus(status);
		list.set(index-1, t);
	}
	
	public void display()
	{
		list.forEach(e -> System.out.println("Task: "+e.getTask()+" , Status:"+e.getStatus()));
		System.out.println();
	}
	

}
