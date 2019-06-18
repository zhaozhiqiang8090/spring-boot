package com.zzq.basic.algorithm.niuke.tree;

public class No62KthNode {

    private static int index = 1;

    public static TreeNode kthNode(TreeNode pRoot, int k) {
        if (pRoot == null || k <= 0) {
            return null;
        }
        TreeNode node = kthNode(pRoot.left, k);
        if (node != null) {
            return node;
        }
        if (index++ >= k) {
            return pRoot;
        }
        return kthNode(pRoot.right, k);
    }

}
