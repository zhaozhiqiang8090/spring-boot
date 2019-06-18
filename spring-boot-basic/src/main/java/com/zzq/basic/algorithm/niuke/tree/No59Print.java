package com.zzq.basic.algorithm.niuke.tree;

import java.util.ArrayList;
import java.util.Stack;

public class No59Print {

    public static ArrayList<ArrayList<Integer>> print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if (pRoot == null)
            return lists;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        TreeNode node;
        stack1.push(pRoot);
        while (!stack1.empty() || !stack2.empty()) {
            ArrayList<Integer> list = null;
            while (!stack1.empty()) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                node = stack1.pop();
                list.add(node.val);
                if (node.left != null)
                    stack2.push(node.left);
                if (node.right != null)
                    stack2.push(node.right);
            }
            if (list != null) {
                lists.add(list);
            }
            ArrayList<Integer> list2 = null;
            while (!stack2.empty()) {
                if (list2 == null) {
                    list2 = new ArrayList<>();
                }
                node = stack2.pop();
                list2.add(node.val);
                if (node.right != null)
                    stack1.push(node.right);
                if (node.left != null)
                    stack1.push(node.left);
            }
            if (list2 != null) {
                lists.add(list2);
            }
        }
        return lists;
    }

}
