package com.sangita.multithreading;

import java.util.concurrent.RecursiveTask;

class ArraySumTask extends RecursiveTask<Integer> {
    private final int[] array;
    private final int start, end;
    private static final int THRESHOLD = 10; 

    public ArraySumTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        // Step 1: If the task is small enough, process it directly
        if (end - start <= THRESHOLD) {
            return processDirectly();
        }

        // Step 2: Split the task into two smaller parts
        int mid = (start + end) / 2;
        ArraySumTask leftTask = new  ArraySumTask(array, start, mid);
        ArraySumTask rightTask = new  ArraySumTask(array, mid, end);

        // Step 3: Fork the left task (pushing it to another thread)
        leftTask.fork();

        // Step 4: Compute the right task in the current thread
        int rightResult = rightTask.compute();

        // Step 5: Wait for the left task to complete and combine results
        int leftResult = leftTask.join();

        return leftResult + rightResult;
    }

    private Integer processDirectly() {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }
    
}

