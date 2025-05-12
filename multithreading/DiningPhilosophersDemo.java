package com.sangita.multithreading;

class Fork {
    private final int id;

    public Fork(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

class Philosopher extends Thread {
    private final int id;
    private final Fork leftFork;
    private final Fork rightFork;

    public Philosopher(int id, Fork left, Fork right) {
        this.id = id;
        this.leftFork = left;
        this.rightFork = right;
    }

    private void think() throws InterruptedException {
        System.out.println("Philosopher " + id + " is thinking.");
        Thread.sleep((long) (Math.random() * 1000));
    }

    private void eat() throws InterruptedException {
        System.out.println("Philosopher " + id + " is eating.");
        Thread.sleep((long) (Math.random() * 1000));
    }

    @Override
    public void run() {
        try {
            while (true) {
                think();

                // To avoid deadlock: pick lower-numbered fork first
                Fork first = leftFork.getId() < rightFork.getId() ? leftFork : rightFork;
                Fork second = leftFork.getId() < rightFork.getId() ? rightFork : leftFork;

                synchronized (first) {
                    synchronized (second) {
                        eat();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Philosopher " + id + " was interrupted.");
        }
    }
}

public class DiningPhilosophersDemo {
    public static void test(){
        Fork[] forks = new Fork[5];
        Philosopher[] philosophers = new Philosopher[5];

        // Create forks
        for (int i = 0; i < 5; i++) {
            forks[i] = new Fork(i);
        }

        // Create philosophers
        for (int i = 0; i < 5; i++) {
            Fork left = forks[i];
            Fork right = forks[(i + 1) % 5];
            philosophers[i] = new Philosopher(i, left, right);
            philosophers[i].start();
        }
    }
}
