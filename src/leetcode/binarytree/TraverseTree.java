package leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

public class TraverseTree {

  public static List<Integer> preorderTraversalRecursive(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    if (root == null)
      return res;
    res.add(root.getVal());
    res.addAll(preorderTraversalRecursive(root.getLeft()));
    res.addAll(preorderTraversalRecursive(root.getRight()));
    return res;
  }

}
