package com.sangita.collections;
import java.util.*;


class PrintJob {
    String documentName;

    public PrintJob(String documentName) {
        this.documentName = documentName;
    }

    @Override
    public String toString() {
        return "Printing: " + documentName;
    }
}

public class PrintQueue {

	Queue<PrintJob> printQueue = new LinkedList<>();

    // Add a new job to the queue
    public void addJob(String documentName) {
        printQueue.offer(new PrintJob(documentName));
        System.out.println("Added to queue: " + documentName);
    }

    // Process print jobs in order
    public void processJobs() {
        while (!printQueue.isEmpty()) {
            PrintJob job = printQueue.poll();  // removes and returns the head
            System.out.println(job);

        }
    }

}
