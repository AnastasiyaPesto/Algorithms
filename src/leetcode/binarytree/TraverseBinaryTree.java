package leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

public class TraverseBinaryTree {

  public static List<Integer> preorderTraversalRecursive(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    if (root == null)
      return res;
    res.add(root.getVal());
    res.addAll(preorderTraversalRecursive(root.getLeft()));
    res.addAll(preorderTraversalRecursive(root.getRight()));
    return res;
  }

  public static List<Integer> preorderTraversalIterative (TreeNode root) {
    if (root == null)
      return null;
    List<Integer> res = new ArrayList<>();
    TreeNode left = root.getLeft();
    TreeNode right = root.getRight();
    while (left != null) {
      res.add(left.getVal());
      left = left.getLeft();
    }
    return res;
  }

}
