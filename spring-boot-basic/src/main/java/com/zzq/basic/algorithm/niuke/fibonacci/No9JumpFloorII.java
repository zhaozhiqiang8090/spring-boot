package com.zzq.basic.algorithm.niuke.fibonacci;

public class No9JumpFloorII {

    public static int jumpII(int target) {
        if (target <= 0) {
            return 0;
        }

        return (int) Math.pow(2, target - 1);
    }

}
