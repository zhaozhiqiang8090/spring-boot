package com.zzq.basic.algorithm.niuke.fibonacci;

public class No8JumpFloor {

    public static int jump(int target) {
        if (target <= 0) {
            return 0;
        }
        if (target <= 2) {
            return target;
        }
        return jump(target - 1) + jump(target - 2);
    }

    public static int jump2(int target) {
        if (target <= 0) {
            return 0;
        }
        if (target <= 2) {
            return target;
        }

        int pre2 = 1;
        int pre1 = 2;
        int current = 0;
        while (target-- >= 3) {
            current = pre1 + pre2;
            pre2 = pre1;
            pre1 = current;
        }
        return current;
    }

}
