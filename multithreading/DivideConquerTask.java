package com.sangita.multithreading;

import java.util.concurrent.RecursiveTask;

public class DivideConquerTask extends RecursiveTask<Integer> {
    private int[] arr;
    private int start, end;

    public DivideConquerTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int threshold = 3;
        if ((end - start) <= threshold) {
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += arr[i];
            }
            return sum;
        } else {
            int mid = (start + end) / 2;
            ArraySumTask left = new ArraySumTask(arr, start, mid);
            ArraySumTask right = new ArraySumTask(arr, mid, end);

            left.fork(); // compute left asynchronously
            int rightResult = right.compute(); // compute right directly
            int leftResult = left.join(); // wait for left to finish

            return leftResult + rightResult;
        }
    }
}