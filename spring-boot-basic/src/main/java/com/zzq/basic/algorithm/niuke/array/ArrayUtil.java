package com.zzq.basic.algorithm.niuke.array;

public class ArrayUtil {

    public static void swap(int[] array, int i, int j) {
        if (array != null && i >= 0 && i < array.length && j >= 0 && j < array.length) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void swap(char[] array, int i, int j) {
        if (array != null && i >= 0 && i < array.length && j >= 0 && j < array.length) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void swap(String[] array, int i, int j) {
        if (array != null && i >= 0 && i < array.length && j >= 0 && j < array.length) {
            String temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void printArray(int[] array) {
        if (array != null) {
            for (int i : array) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();
    }
}
