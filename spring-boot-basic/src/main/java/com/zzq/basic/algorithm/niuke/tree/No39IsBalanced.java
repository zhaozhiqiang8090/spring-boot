package com.zzq.basic.algorithm.niuke.tree;

public class No39IsBalanced {

    public static boolean isBalanced(TreeNode root) {
        return getDepth(root) != -1;
    }

    public static int getDepth(TreeNode root) {
        if (root == null) return 0;
        int left = getDepth(root.left);
        if (left == -1) return -1;
        int right = getDepth(root.right);
        if (right == -1) return -1;
        return Math.abs(left - right) > 1 ? -1 : 1 + Math.max(left, right);
    }

}
