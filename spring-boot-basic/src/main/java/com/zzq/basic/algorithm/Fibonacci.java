package com.zzq.basic.algorithm;

public class Fibonacci {

    /**
     * 递归法
     *
     * @param index
     * @return
     */
    public static int getValueByRecursion(int index) {
        if (index < 1) {
            System.out.println("invalid index!");
            return -1;
        }

        if (index == 1 || index == 2) {
            return 1;
        }

        return getValueByRecursion(index - 1) + getValueByRecursion(index - 2);
    }

    /**
     * 遍历法
     *
     * @param index
     * @return
     */
    public static int getValueByTraversion(int index) {
        if (index < 1) {
            System.out.println("invalid index!");
            return -1;
        }

        if (index == 1 || index == 2) {
            return 1;
        }

        int previous1 = 1;
        int previous2 = 1;
        int current = 0;
        for (int i = 3; i <= index; i++) {
            current = previous1 + previous2;
            previous2 = previous1;
            previous1 = current;
        }

        return current;
    }

    public static void main(String[] args) {
        System.out.println(getValueByRecursion(8));
        System.out.println(getValueByTraversion(8));
    }

}
