package com.zzq.basic.algorithm.niuke.tree;

import java.util.LinkedList;
import java.util.Stack;

public class TreeUtil {

    public static TreeNode init(int start, int level) {
        if (level <= 0) {
            return null;
        }
        TreeNode root = new TreeNode(start);
        root.left = init(2 * start, level - 1);
        root.right = init(2 * start + 1, level - 1);
        return root;
    }

    /**
     * 前序遍历递归打印
     *
     * @param node
     */
    public static void printTreeByPreOrder(TreeNode node) {
        printTreeByPreOrderDetail(node);
        System.out.println();
    }

    private static void printTreeByPreOrderDetail(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            printTreeByPreOrderDetail(node.left);
            printTreeByPreOrderDetail(node.right);
        }
    }

    /**
     * 中序遍历递归打印
     *
     * @param node
     */
    public static void printTreeByInOrder(TreeNode node) {
        printTreeByInOrderDetail(node);
        System.out.println();
    }

    private static void printTreeByInOrderDetail(TreeNode node) {
        if (node != null) {
            printTreeByInOrderDetail(node.left);
            System.out.print(node.val + " ");
            printTreeByInOrderDetail(node.right);
        }
    }

    /**
     * 后序遍历递归打印
     *
     * @param node
     */
    public static void printTreeByPostOrder(TreeNode node) {
        printTreeByPostOrderDetail(node);
        System.out.println();
    }

    private static void printTreeByPostOrderDetail(TreeNode node) {
        if (node != null) {
            printTreeByPostOrderDetail(node.left);
            printTreeByPostOrderDetail(node.right);
            System.out.print(node.val + " ");
        }
    }

    public static void printTree(TreeNode root) {
        if (root != null) {
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            TreeNode node;
            int pCount;      //当前层结点数目
            int nextCount = 1;   //下一层结点数目
            while (!queue.isEmpty()) {
                pCount = nextCount;
                nextCount = 0;
                //打印当前层数字，并计算下一层结点数目
                for (int i = 1; i <= pCount; i++) {
                    node = queue.poll();
                    if (node != null) {
                        System.out.print(node.val + "\t");
                        if (node.left != null) {
                            queue.offer(node.left);
                            nextCount++;
                        }
                        if (node.right != null) {
                            queue.offer(node.right);
                            nextCount++;
                        }
                    }
                }
                System.out.println();
            }
        }
    }

}
