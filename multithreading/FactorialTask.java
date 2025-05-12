package com.sangita.multithreading;

import java.util.concurrent.RecursiveTask;

class FactorialTask extends RecursiveTask<Long> {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int number;

    public FactorialTask(int number) {
        this.number = number;
    }

    @Override
    protected Long compute() {
        if (number <= 1) {
            return 1L;
        } else {
            FactorialTask subTask = new FactorialTask(number - 1);
            subTask.fork(); // Execute the sub-task asynchronously
            return number * subTask.join(); // Wait for the result
        }
    }
}