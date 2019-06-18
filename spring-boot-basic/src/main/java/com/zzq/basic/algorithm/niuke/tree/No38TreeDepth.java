package com.zzq.basic.algorithm.niuke.tree;

public class No38TreeDepth {

    private static int current = 0;
    public static int treeDepth(TreeNode root) {
        if (root == null) {
            return current;
        }
        current++;
        int max1 = treeDepth(root.left);
        int max2 = treeDepth(root.right);
        current--;
        return max1 > max2 ? max1 : max2;
    }

}
