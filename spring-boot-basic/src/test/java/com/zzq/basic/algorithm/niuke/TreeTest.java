package com.zzq.basic.algorithm.niuke;

import com.zzq.basic.algorithm.niuke.linkedlist.ListUtil;
import com.zzq.basic.algorithm.niuke.tree.TreeNode;
import com.zzq.basic.algorithm.niuke.tree.TreeUtil;
import org.junit.Test;

import java.util.ArrayList;

import static com.zzq.basic.algorithm.niuke.tree.No17HasSubtree.hasSubtree;
import static com.zzq.basic.algorithm.niuke.tree.No18Mirror.mirror;
import static com.zzq.basic.algorithm.niuke.tree.No22PrintFromTopToBottom.printFromTopToBottom;
import static com.zzq.basic.algorithm.niuke.tree.No23VerifySequenceOfBST.verifySequenceOfBST;
import static com.zzq.basic.algorithm.niuke.tree.No24FindPath.findPath;
import static com.zzq.basic.algorithm.niuke.tree.No4ReConstructBinaryTree.reConstructBinaryTree;

public class TreeTest {

    @Test
    public void no4ReConstructBinaryTree() {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode node = reConstructBinaryTree(pre, in);
        TreeUtil.printTree(node);
    }

    @Test
    public void no17HasSubtree() {
        TreeNode root1 = TreeUtil.init(1, 3);
        TreeUtil.printTree(root1);
        TreeNode root2 = TreeUtil.init(2, 3);
        TreeUtil.printTree(root2);
        System.out.println(hasSubtree(root1, root2));
    }

    @Test
    public void no18Mirror() {
        TreeNode root1 = TreeUtil.init(1, 3);
        TreeUtil.printTree(root1);
        mirror(root1);
        TreeUtil.printTree(root1);
    }

    @Test
    public void no22PrintFromTopToBottom() {
        TreeNode root = TreeUtil.init(1, 3);
        TreeUtil.printTree(root);
        ArrayList<Integer> list = printFromTopToBottom(root);
        ListUtil.printList(list);
    }

    @Test
    public void no23VerifySequenceOfBST() {
        int[] s = {2, 4, 3, 6, 8, 7, 5};
        System.out.println(verifySequenceOfBST(s));
    }

    @Test
    public void no24FindPath() {
        TreeNode node = TreeUtil.init(1, 4);
        TreeUtil.printTree(node);
        ArrayList<ArrayList<Integer>> pathList = findPath(node, 15);
        for (ArrayList list : pathList) {
            ListUtil.printList(list);
        }
    }

}
