public class DCP8CountUnivalSubtree {

  public static int countUnivalSubtree(TreeNode root) {
    // if (root == null) {
    // return 0;
    // }
    // int leftCount = countUnivalSubtree(root.left);
    // int rightCount = countUnivalSubtree(root.right);

    // return isUnival(root) ? rightCount + leftCount + 1 : rightCount + leftCount;

    int[] result = countUnivalSubtreeHelper(root);
    return result[0];

  }

  // Helper method
  public static int[] countUnivalSubtreeHelper(TreeNode root) {
    /*
     * This method keeps track of unival subtree count and value as we percolate
     * back up. This runs in O(n) time because this function evaluate each node at
     * once as it started as the leave nodes at the tree.
     * 
     * Return an array of length 2, where the first value is unival subtree count
     * and second value is if node itself unival or not. We are returning int value
     * 0:false and 1:true. e.g. [2, 1] => subtree count = 0 and unival = true.
     */

    if (root == null) {
      int[] result = { 0, 1 };
      return result;
    }
    int[] leftCount = countUnivalSubtreeHelper(root.left);
    int[] rightCount = countUnivalSubtreeHelper(root.right);

    int totalCount = leftCount[0] + rightCount[0];
    int[] result = { totalCount, 0 };

    if (leftCount[1] == 1 && rightCount[1] == 1) {
      if (root.left != null && root.val != root.left.val) {
        return result;
      }
      if (root.right != null && root.val != root.right.val) {
        return result;
      }
      result[0] = totalCount + 1;
      result[1] = 1;
      return result;
    }
    return result;
  }

  public static boolean isUnival(TreeNode root) {
    return isUnivalHelper(root, root.val);
  }

  // Helper method
  public static boolean isUnivalHelper(TreeNode root, int value) {
    if (root == null) {
      return true;
    }
    if (root.val == value) {
      return isUnivalHelper(root.left, value) && isUnivalHelper(root.right, value);
    }
    return false;
  }

  public static void main(String[] args) {

    TreeNode root = new TreeNode(0);
    root.left = new TreeNode(1);
    root.right = new TreeNode(0);
    root.right.left = new TreeNode(1);
    root.right.right = new TreeNode(0);
    root.right.left.left = new TreeNode(1);
    root.right.left.right = new TreeNode(1);

    System.out.println(countUnivalSubtree(null));
    System.out.println(countUnivalSubtree(root));

    // Tree representation
    //   0
    //  / \
    // 1   0
    //    / \
    //   1   0
    //  / \
    // 1   1
  }
}
