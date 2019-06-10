package com.zzq.basic.algorithm.niuke.matrix;

public class No1Find {

    /**
     * 从左下角开始
     *
     * @param target
     * @param array
     * @return
     */
    public static boolean find(int target, int[][] array) {
        if (array != null && array.length > 0 && array[0].length > 0) {
            int row = array.length - 1; //初始化行的值
            int col = 0; //初始化列的值
            //循环遍历判断，寻找target
            while (row >= 0 && col <= array[0].length - 1) {
                if (target == array[row][col]) {
                    return true;
                } else if (target < array[row][col]) {
                    row--;
                } else {
                    col++;
                }
            }
        }

        return false;
    }

    /**
     * 从右上角开始
     *
     * @param target
     * @param array
     * @return
     */
    public static boolean find1(int target, int[][] array) {
        if (array != null && array.length > 0 && array[0].length > 0) {
            int row = 0;
            int col = array[0].length - 1;
            while (row <= array.length - 1 && col >= 0) {
                if (target == array[row][col]) {
                    return true;
                } else if (target < array[row][col]) {
                    col--;
                } else {
                    row++;
                }
            }
        }

        return false;
    }

}
