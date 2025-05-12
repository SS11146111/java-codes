package com.sangita.multithreading;

import java.util.concurrent.ForkJoinPool;

public class Main {

	public static void main(String[] args) {
		/*
		 * ExtendThread t1 = new ExtendThread(); t1.start()
		 */
		
		/*
		 * ImplementRunnable m1 = new ImplementRunnable(); Thread t1 = new Thread(m1);
		 * t1.start();
		 */
		
		/*
		 * PrintNumbers t1 = new PrintNumbers(); t1.start();
		 */
		
		/*
		 * PrintOddEven.NUM = 20; PrintOddEven oe = new PrintOddEven();
		 * 
		 * Thread th1 = new Thread(new Runnable() { public void run() {
		 * oe.displayOddNumbers(); } });
		 * 
		 * Thread th2 = new Thread(new Runnable() { public void run() {
		 * oe.displayEvenNumbers(); } });
		 * 
		 * th1.start(); th2.start();
		 */
		
		/*
		 * PrintMessage t1 = new PrintMessage(); t1.start();
		 */
		
		/*
		 * HandleException t1 = new HandleException(); t1.start(); try {
		 * Thread.sleep(5000); // Let it run for a bit } catch (InterruptedException e)
		 * { e.printStackTrace(); }
		 * 
		 * t1.interrupt();
		 */
		
		/*
		 * Test t = new Test(); t.test();
		 */
		
		/*
		 * DaemonThreadExample d1 = new DaemonThreadExample(); d1.demo();
		 * System.out.println("Main thread sleeping for 3 seconds..."); try {
		 * Thread.sleep(3000); } catch (InterruptedException e) {
		 * System.out.println("Main thread interrupted"); }
		 * 
		 * System.out.
		 * println("Main thread finished. JVM will now exit, and daemon will be killed."
		 * );
		 */
		
		/*
		 * BankDemo bank = new BankDemo(); Thread withdrawThread = new Thread(() ->
		 * bank.withdraw(1000)); Thread depositThread = new Thread(() -> { try {
		 * Thread.sleep(2000); // simulate delay bank.deposit(1500); } catch
		 * (InterruptedException e) { e.printStackTrace(); } });
		 * 
		 * withdrawThread.start(); depositThread.start();
		 */
		
		/*
		 * ProducerConsumer pc = new ProducerConsumer(); Thread consumer = new
		 * Thread(()->{
		 * 
		 * for (int i = 1; i <= 5; i++) { pc.consume(); try { Thread.sleep(2000); }
		 * catch (InterruptedException e) { e.printStackTrace(); } }
		 * 
		 * });
		 * 
		 * 
		 * Thread producer = new Thread( ()->{ for(int i=1;i<=5;i++) { pc.produce(i);
		 * try { Thread.sleep(2000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * }});
		 * 
		 * consumer.start(); producer.start();
		 */
		
		/*
		 * DeadLockProblemDemo d = new DeadLockProblemDemo(); d.startTHread();
		 */	
		
		/* DeadLockSolutionDemo d = new DeadLockSolutionDemo(); d.startTHread(); */
		
		/* DiningPhilosophersDemo.test(); */
		
		 
		/*
		 * ReentrantLockDemo obj = new ReentrantLockDemo(); Runnable task = () ->
		 * obj.m(); Thread t1 = new Thread(task, "Thread-1"); Thread t2 = new
		 * Thread(task, "Thread-2"); t1.start(); t2.start();
		 */
	
		/*
		 * int num = 5; // Change this to compute factorial of any number ForkJoinPool
		 * pool = new ForkJoinPool(); FactorialTask task = new FactorialTask(num);
		 * 
		 * long result = pool.invoke(task); System.out.println("Factorial of " + num +
		 * " is " + result);
		 */
		
		/*
		 * int[] data = new int[100]; for (int i = 0; i < data.length; i++) { data[i] =
		 * i + 1; }
		 * 
		 * ForkJoinPool pool = new ForkJoinPool(); ArraySumTask task = new
		 * ArraySumTask(data, 0, data.length);
		 * 
		 * // Step 6: Invoke the task, triggering the ForkJoinPool to distribute work
		 * int result = pool.invoke(task);
		 * 
		 * System.out.println("Total Sum: " + result);
		 */
		
		
		/*
		 * int[][] A = { {1, 2, 3}, {4, 5, 6} }; int[][] B = { {7, 8}, {9, 10}, {11, 12}
		 * }; int[][] C = new int[A.length][B[0].length];
		 * 
		 * ForkJoinPool pool = new ForkJoinPool(); MatrixMultiplyTask task = new
		 * MatrixMultiplyTask(A, B, C, 0, A.length); pool.invoke(task);
		 * 
		 * // Print result for (int[] row : C) { for (int val : row) {
		 * System.out.print(val + " "); } System.out.println(); }
		 */
		
		/*
		 * int[] arr = {3, 5, 8, 2, 9, 1, 7, 6};
		 * 
		 * ForkJoinPool pool = new ForkJoinPool(); ArraySumTask task = new
		 * ArraySumTask(arr, 0, arr.length);
		 * 
		 * int totalSum = pool.invoke(task); System.out.println("Total sum: " +
		 * totalSum);
		 */
	    }
	

}
