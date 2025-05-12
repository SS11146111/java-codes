package com.sangita.multithreading;

public class DaemonThreadExample {
	
	public void demo()
	{
		Thread daemonThread = new Thread(() -> {
            int count = 1;
            while (true) {
                System.out.println("Daemon thread running... " + count++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Daemon interrupted");
                }
            }
        });
		
		daemonThread.setDaemon(true);
        daemonThread.start();
	}

}
