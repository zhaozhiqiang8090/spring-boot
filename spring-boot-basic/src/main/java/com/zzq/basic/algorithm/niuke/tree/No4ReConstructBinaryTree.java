package com.zzq.basic.algorithm.niuke.tree;

public class No4ReConstructBinaryTree {

    /**
     * 重建入口
     *
     * @param pre
     * @param in
     * @return
     */
    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre != null && in != null && pre.length == in.length && pre.length > 0) {
            return reConstructBinaryTreeDetail(pre, 0, pre.length - 1, in, 0, in.length - 1);
        }
        return null;
    }

    /**
     * 构建
     *
     * @param pre
     * @param preStart
     * @param preEnd
     * @param in
     * @param inStart
     * @param inEnd
     * @return
     */
    public static TreeNode reConstructBinaryTreeDetail(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
        //开始位置大于结束位置说明已经处理到叶节点了
        if (preStart > preEnd) {
            return null;
        }
        ///前序遍历第一个数字为当前的根节点
        int value = pre[preStart];
        //index为根节点在中序遍历序列中的索引
        int index = inStart;
        while (index <= inEnd && in[index] != value) {
            index++;
        }
        System.out.println("当前各参数的数值为->preStart:" + preStart + " preEnd:" + preEnd + " inStart：" + inStart + " inEnd：" + inEnd + " index：" + index + " rootValue：" + value);
        //如果在整个中序遍历中没有找到根节点说明输入的数据是不合法的
        if (index > inEnd) {
            throw new RuntimeException("invalid input" + index);
        }
        TreeNode node = new TreeNode(value);
        //当前节点的左子树的个数为index-inStart
        //左子树对应的前序遍历的位置在pre[preStart+1,preStart+index-inStart]
        //左子树对应的中序遍历的位置在in[inStart,index-1]
        node.left = reConstructBinaryTreeDetail(pre, preStart + 1, preStart + index - inStart, in, inStart, index - 1);
        //当前节点的右子树的个数为inEnd-index
        //右子树对应的前序遍历位置在pre[preStart+index-inStart+1,preEnd]
        //右子树对应的中序遍历位置在in[index+1,inEnd]
        node.right = reConstructBinaryTreeDetail(pre, preStart + index - inStart + 1, preEnd, in, index + 1, inEnd);
        return node;
    }

}
