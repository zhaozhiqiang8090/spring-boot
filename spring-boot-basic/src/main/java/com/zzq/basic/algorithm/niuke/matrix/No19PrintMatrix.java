package com.zzq.basic.algorithm.niuke.matrix;

import java.util.ArrayList;

public class No19PrintMatrix {

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        if (matrix == null) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int rowLow = 0;
        int rowHigh = matrix.length - 1;
        int colRight = matrix[0].length - 1;
        int colLeft = 0;
        int i;
        int j;

        while (rowLow <= rowHigh && colRight >= colLeft) {
            i = rowLow;
            j = colLeft;
            while (j <= colRight) {
                list.add(matrix[i][j++]);
            }
            j--;
            i++;
            while (i <= rowHigh) {
                list.add(matrix[i++][j]);
            }
            if (rowLow != rowHigh && colRight != colLeft) {
                i--;
                j--;
                while (j >= colLeft) {
                    list.add(matrix[i][j--]);
                }
                j++;
                i--;
                while (i > rowLow) {
                    list.add(matrix[i--][j]);
                }
            }
            rowLow++;
            colRight--;
            rowHigh--;
            colLeft++;
        }
        return list;
    }

}
