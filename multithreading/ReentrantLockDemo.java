package com.sangita.multithreading;

public class ReentrantLockDemo {

    public synchronized void m() {
        System.out.println(Thread.currentThread().getName() + " entered m()");
        n();
        System.out.println(Thread.currentThread().getName() + " exiting m()");
    }

    public synchronized void n() {
        System.out.println(Thread.currentThread().getName() + " entered n()");
        try {
            Thread.sleep(500); // simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " exiting n()");
    }
}

