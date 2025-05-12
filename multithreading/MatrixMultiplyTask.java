package com.sangita.multithreading;

import java.util.concurrent.RecursiveAction;

class MatrixMultiplyTask extends RecursiveAction {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int[][] A, B, C;
    private final int rowStart, rowEnd;

    public MatrixMultiplyTask(int[][] A, int[][] B, int[][] C, int rowStart, int rowEnd) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.rowStart = rowStart;
        this.rowEnd = rowEnd;
    }

    @Override
    protected void compute() {
        int threshold = 10; // Threshold for splitting
        if ((rowEnd - rowStart) <= threshold) {
            // Do computation
            for (int i = rowStart; i < rowEnd; i++) {
                for (int j = 0; j < B[0].length; j++) {
                    int sum = 0;
                    for (int k = 0; k < A[0].length; k++) {
                        sum += A[i][k] * B[k][j];
                    }
                    C[i][j] = sum;
                }
            }
        } else {
            int mid = (rowStart + rowEnd) / 2;
            MatrixMultiplyTask task1 = new MatrixMultiplyTask(A, B, C, rowStart, mid);
            MatrixMultiplyTask task2 = new MatrixMultiplyTask(A, B, C, mid, rowEnd);
            invokeAll(task1, task2);
        }
    }
}
