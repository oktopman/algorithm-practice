package me.oktop.leetcode;

public class Solution_100 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p.val != q.val) {
            return false;
        }
        TreeNode pLeft = p.left;
        TreeNode pRight = p.right;
        TreeNode qLeft = q.left;
        TreeNode qRight = q.right;
        if (pLeft == qLeft || pLeft == qRight || pRight == qLeft || pRight == qRight) {
            return true;
        }
        if (pLeft.val == qLeft.val) {
            return isSameTree(pLeft, qLeft);
        }
        if (pLeft.val == qRight.val) {
            return isSameTree(pLeft, qRight);
        }
        if (pRight.val == qLeft.val) {
            return isSameTree(pRight, qLeft);
        }
        if (pRight.val == qRight.val) {
            return isSameTree(pRight, qRight);
        }
        return false;

    }
}
