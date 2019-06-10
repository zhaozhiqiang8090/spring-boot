package com.zzq.basic.algorithm.niuke.matrix;

public class MatrixUtil {

    public static int[][] init(int row, int col) {
        if (row <= 0 || col <= 0) {
            return null;
        }

        int[][] result = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = i * col + j + 1;
            }
        }
        return result;
    }

    public static void printMatrix(int[][] m) {
        if (m != null) {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    System.out.print(m[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
