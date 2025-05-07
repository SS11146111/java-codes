package com.sangita.oops;

public class AnonymousRunnableDemo {
    public static void main(String[] args) {
        // Creating a Runnable using an anonymous class
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in a separate thread using an anonymous class.");
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Count: " + i);
                    try {
                        Thread.sleep(500); // Pause for 500 milliseconds
                    } catch (InterruptedException e) {
                        System.out.println("Thread was interrupted.");
                    }
                }
            }
        };

        // Starting the thread
        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Main thread ends.");
    }
}
