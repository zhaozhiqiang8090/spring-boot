package com.zzq.basic.algorithm.niuke.tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class No22PrintFromTopToBottom {

    public static ArrayList<Integer> printFromTopToBottom(TreeNode root) {
        if (root == null) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode node;
        while (queue.size() != 0) {
            node = queue.poll();
            list.add(node.val);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return list;
    }

}
