package com.zzq.basic.algorithm.niuke.tree;

import java.util.ArrayList;

public class No24FindPath {

    private static ArrayList<Integer> nodeList = new ArrayList<>();
    private static ArrayList<ArrayList<Integer>> pathList = new ArrayList<>();

    public static ArrayList<ArrayList<Integer>> findPath(TreeNode node, int target) {
        if (node == null) {
            return pathList;
        }
        nodeList.add(node.val);
        target -= node.val;
        if (target == 0 && node.left == null && node.right == null) {  //叶子结点
            //长度大的nodeList插入到pathList的前面
            int i = 0;
            while (i < pathList.size() && nodeList.size() < pathList.get(i).size()) //记得防止越界{
                i++;
            pathList.add(i, new ArrayList<>(nodeList));  //nodeList会随方法变化，必须新建一个list存入pathList中！
        } else {  //不是叶子结点
            pathList = findPath(node.left, target);
            pathList = findPath(node.right, target);
        }
        nodeList.remove(nodeList.size() - 1);  //记得删除当前结点
        return pathList;
    }

}
