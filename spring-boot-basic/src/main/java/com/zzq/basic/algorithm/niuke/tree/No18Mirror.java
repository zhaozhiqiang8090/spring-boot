package com.zzq.basic.algorithm.niuke.tree;

public class No18Mirror {

    public static void mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        mirror(root.left);
        mirror(root.right);
    }

}
