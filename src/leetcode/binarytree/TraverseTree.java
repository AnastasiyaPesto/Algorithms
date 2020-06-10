package leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

public class TraverseTree {

  private static List<Integer> preorderTraversalRecursive(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    if (root == null)
      return res;
    res.add(root.val);
    res.addAll(preorderTraversalRecursive (root.left));
    res.addAll(preorderTraversalRecursive (root.right));
    return res;
  }

  static class TreeNode {
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
}
