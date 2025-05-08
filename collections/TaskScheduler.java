package com.sangita.collections;
import java.util.*;

class Task1 implements Comparable<Task1>
{
	String name;
	int priority; 

    public Task1(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    // Define sorting logic: lower priority number comes first
    @Override
    public int compareTo(Task1 other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Task: " + name + ", Priority: " + priority;
    }

}

public class TaskScheduler {
	
	private PriorityQueue<Task1> taskQueue = new PriorityQueue<>();

	public void addTask(String name, int priority) {
		taskQueue.offer(new Task1(name, priority));
	}

	public void runTasks() {
	   while (!taskQueue.isEmpty()) {
	       Task1 task = taskQueue.poll(); // Gets the task with highest priority (lowest number)
	       System.out.println("Executing -> " + task);
	   }
	}

}
