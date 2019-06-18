package com.zzq.basic.algorithm.niuke.tree;

public class No58IsSymmetrical {

    public static boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) {
            return true;
        }
        return isSymmetricalDetail(pRoot.left, pRoot.right);
    }

    private static boolean isSymmetricalDetail(TreeNode left, TreeNode right) {
        if (left != null && right != null && left.val == right.val) {
            return isSymmetricalDetail(left.left, right.right) && isSymmetricalDetail(left.right, right.left);
        }
        return left == null && right == null;
    }

}
