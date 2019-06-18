package com.zzq.basic.algorithm.niuke.tree;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class No60Print {

    public static ArrayList<ArrayList<Integer>> print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if (pRoot == null) {
            return lists;
        }
        Queue<TreeNode> queue1 = new LinkedBlockingQueue<>();
        Queue<TreeNode> queue2 = new LinkedBlockingQueue<>();
        TreeNode node;
        queue1.offer(pRoot);
        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            ArrayList<Integer> list = null;
            while (!queue1.isEmpty()) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                node = queue1.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue2.offer(node.left);
                }
                if (node.right != null) {
                    queue2.offer(node.right);
                }
            }
            if (list != null) {
                lists.add(list);
            }
            ArrayList<Integer> list2 = null;
            while (!queue2.isEmpty()) {
                if (list2 == null) {
                    list2 = new ArrayList<>();
                }
                node = queue2.poll();
                list2.add(node.val);
                if (node.left != null) {
                    queue1.offer(node.left);
                }
                if (node.right != null) {
                    queue1.offer(node.right);
                }
            }
            if (list2 != null) {
                lists.add(list2);
            }
        }
        return lists;
    }

}
