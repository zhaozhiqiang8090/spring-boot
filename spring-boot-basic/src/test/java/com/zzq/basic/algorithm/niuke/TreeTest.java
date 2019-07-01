package com.zzq.basic.algorithm.niuke;

import com.zzq.basic.algorithm.niuke.linkedlist.ListUtil;
import com.zzq.basic.algorithm.niuke.tree.No60Print;
import com.zzq.basic.algorithm.niuke.tree.TreeLinkNode;
import com.zzq.basic.algorithm.niuke.tree.TreeNode;
import com.zzq.basic.algorithm.niuke.tree.TreeUtil;
import org.junit.Test;

import java.util.ArrayList;

import static com.zzq.basic.algorithm.niuke.tree.No17HasSubtree.hasSubtree;
import static com.zzq.basic.algorithm.niuke.tree.No18Mirror.mirror;
import static com.zzq.basic.algorithm.niuke.tree.No22PrintFromTopToBottom.printFromTopToBottom;
import static com.zzq.basic.algorithm.niuke.tree.No23VerifySequenceOfBST.verifySequenceOfBST;
import static com.zzq.basic.algorithm.niuke.tree.No24FindPath.findPath;
import static com.zzq.basic.algorithm.niuke.tree.No26Convert.convert;
import static com.zzq.basic.algorithm.niuke.tree.No38TreeDepth.treeDepth;
import static com.zzq.basic.algorithm.niuke.tree.No39IsBalanced.isBalanced;
import static com.zzq.basic.algorithm.niuke.tree.No4ReConstructBinaryTree.reConstructBinaryTree;
import static com.zzq.basic.algorithm.niuke.tree.No57GetNext.getNext;
import static com.zzq.basic.algorithm.niuke.tree.No58IsSymmetrical.isSymmetrical;
import static com.zzq.basic.algorithm.niuke.tree.No59Print.print;
import static com.zzq.basic.algorithm.niuke.tree.No61Serialize.deserialize;
import static com.zzq.basic.algorithm.niuke.tree.No61Serialize.serialize;
import static com.zzq.basic.algorithm.niuke.tree.No62KthNode.kthNode;

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
//        TreeNode node = TreeUtil.init(1, 4);
        TreeNode node = new TreeNode(10);
        node.left = new TreeNode(5);
        node.right = new TreeNode(12);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(7);
        TreeUtil.printTree(node);
        ArrayList<ArrayList<Integer>> pathList = findPath(node, 15);
        for (ArrayList list : pathList) {
            ListUtil.printList(list);
        }
    }

    @Test
    public void no26Convert() {
        TreeNode node5 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        TreeNode node7 = new TreeNode(7);
        TreeNode node2 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node6 = new TreeNode(6);
        TreeNode node8 = new TreeNode(8);
        node5.left = node3;
        node5.right = node7;
        node3.left = node2;
        node3.right = node4;
        node7.left = node6;
        node7.right = node8;
        TreeUtil.printTree(node5);

        TreeNode node = convert(node5);
        TreeUtil.printTreeNodeAsList(node);
    }

    @Test
    public void no38TreeDepth() {
        TreeNode node = TreeUtil.init(1, 4);
        TreeUtil.printTree(node);
        System.out.println(treeDepth(node));
    }

    @Test
    public void no39IsBalanced() {
        TreeNode node = TreeUtil.init(1, 4);
        TreeUtil.printTree(node);
        System.out.println(isBalanced(node));
    }

    @Test
    public void no57GetNext() {
        TreeLinkNode linkNode1 = new TreeLinkNode(1);
        TreeLinkNode linkNode2 = new TreeLinkNode(2);
        TreeLinkNode linkNode3 = new TreeLinkNode(3);
        TreeLinkNode linkNode4 = new TreeLinkNode(4);
        TreeLinkNode linkNode5 = new TreeLinkNode(5);
        TreeLinkNode linkNode6 = new TreeLinkNode(6);
        TreeLinkNode linkNode7 = new TreeLinkNode(7);

        linkNode1.left = linkNode2;
        linkNode2.next = linkNode1;
        linkNode1.right = linkNode3;
        linkNode3.next = linkNode1;
        linkNode2.left = linkNode4;
        linkNode4.next = linkNode2;
        linkNode2.right = linkNode5;
        linkNode5.next = linkNode2;
        linkNode3.left = linkNode6;
        linkNode6.next = linkNode3;
        linkNode3.right = linkNode7;
        linkNode7.next = linkNode3;

        TreeUtil.printTree(linkNode1);
        TreeLinkNode node = getNext(linkNode1);
        TreeUtil.printTreeNode(node);
    }

    @Test
    public void no58IsSymmetrical() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node21 = new TreeNode(2);
        TreeNode node22 = new TreeNode(2);
        TreeNode node31 = new TreeNode(3);
        TreeNode node32 = new TreeNode(4);
        TreeNode node33 = new TreeNode(4);
        TreeNode node34 = new TreeNode(3);

        node1.left = node21;
        node1.right = node22;
        node21.left = node31;
        node21.right = node32;
        node22.left = node33;
        node22.right = node34;
        TreeUtil.printTree(node1);
        System.out.println(isSymmetrical(node1));
    }

    @Test
    public void no59Print() {
        TreeNode node = TreeUtil.init(1, 4);
        TreeUtil.printTree(node);
        ArrayList<ArrayList<Integer>> lists = print(node);
        for (ArrayList<Integer> list : lists) {
            ListUtil.printList(list);
        }
    }

    @Test
    public void no60Print() {
        TreeNode node = TreeUtil.init(1, 4);
        TreeUtil.printTree(node);
        ArrayList<ArrayList<Integer>> lists = No60Print.print(node);
        for (ArrayList<Integer> list : lists) {
            ListUtil.printList(list);
        }
    }

    @Test
    public void no61Serialize() {
        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        node5.left = node4;
        node4.right = node3;
        node3.right = node2;
        TreeUtil.printTree(node5);
        String s = serialize(node5);
        System.out.println(s);
        node5 = deserialize(s);
        TreeUtil.printTree(node5);
    }

    @Test
    public void no62KthNode() {
        TreeNode node8 = new TreeNode(8);
        TreeNode node6 = new TreeNode(6);
        TreeNode node10 = new TreeNode(10);
        TreeNode node5 = new TreeNode(5);
        TreeNode node7 = new TreeNode(7);
        TreeNode node9 = new TreeNode(9);
        TreeNode node11 = new TreeNode(11);
        node8.left = node6;
        node8.right = node10;
        node6.left = node5;
        node6.right = node7;
        node10.left = node9;
        node10.right = node11;

        TreeUtil.printTree(node8);
        TreeNode node = kthNode(node8, 5);
        TreeUtil.printTreeNode(node);
    }

}
