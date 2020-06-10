package leetcode.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TraverseTreeTest {

  @Test
  public void testPreorderTraversalRecursive() {
    TreeNode nodeRRL = new TreeNode(3, null, null);
    TreeNode nodeRR = new TreeNode(2, nodeRRL, null);
    TreeNode nodeR = new TreeNode(1, null, nodeRR);
    List<Integer> vals = TraverseTree.preorderTraversalRecursive(nodeR);
    Assertions.assertArrayEquals(new Integer[]{1, 2, 3}, vals.toArray());
  }

}