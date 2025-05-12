package com.sangita.multithreading;

public class DeadLockProblemDemo {
	
	final String resource1 = "A";      
    final String resource2 = "B";      
    
    Thread t1 = new Thread() {      
      public void run() {      
          synchronized (resource1) {      
           System.out.println("Thread 1: locked resource 1");   // first print statement   
           try { Thread.sleep(100);} catch (Exception e) {}      
           synchronized (resource2) {      
            System.out.println("Thread 1: locked resource 2");   // second print statement   
           }      
         }      
      }      
    };      
    // t2 tries to lock resource2 then resource1      
    Thread t2 = new Thread() {      
      public void run() {      
        synchronized (resource2) {      
          System.out.println("Thread 2: locked resource 2");    // third print statement  
          try { Thread.sleep(100);} catch (Exception e) {}      
          synchronized (resource1) {      
            System.out.println("Thread 2: locked resource 1");    // fourth print statement  
          }      
        }      
      }      
    }; 
    
    
    public void startTHread()
    {
    	 t1.start();      
    	 t2.start();  
    }

  }      
