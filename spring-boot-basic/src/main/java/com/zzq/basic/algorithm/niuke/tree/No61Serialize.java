package com.zzq.basic.algorithm.niuke.tree;

public class No61Serialize {

    public static String serialize(TreeNode root) {
        if (root == null) {
            return "#,";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(root.val + ",");
        sb.append(serialize(root.left));
        sb.append(serialize(root.right));
        return sb.toString();
    }

    private static int index = 0;

    public static TreeNode deserialize(String str) {
        if (str == null || str.length() == 0)
            return null;
        int start = index;
        while (str.charAt(index) != ',')
            index++;
        TreeNode node = null;
        if (!str.substring(start, index).equals("#")) {
            node = new TreeNode(Integer.parseInt(str.substring(start, index)));
            index++; // 这条语句位置别放错了
            node.left = deserialize(str);
            node.right = deserialize(str);
        } else {
            index++;
        }
        return node;
    }

}
