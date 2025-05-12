package com.sangita.multithreading;

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
	
	}

}
