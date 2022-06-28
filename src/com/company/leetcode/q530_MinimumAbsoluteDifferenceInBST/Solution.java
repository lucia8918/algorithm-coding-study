package com.company.leetcode.q530_MinimumAbsoluteDifferenceInBST;

public class Solution {

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  int min;
  int prev;
  boolean init;

  public int getMinimumDifference(TreeNode root) {

    min = Integer.MAX_VALUE;
    init = false;

    inOrder(root);
    return min;
  }

  // 트리순회 : inorder 의 경우 오름차순 정렬!
  public void inOrder(TreeNode node) {

    if (node == null) {
      return;
    }

    inOrder(node.left);

    // 자기 자신
    if (!init) {
      init = true;
    } else {
      min = Math.min(min, node.val - prev);
    }
    prev = node.val;

    inOrder(node.right);
  }
}
