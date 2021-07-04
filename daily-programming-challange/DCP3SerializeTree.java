import java.util.*;

public class DCP3SerializeTree {
  public static String serialize(TreeNode root) {
    String delimiter = ",";
    if (root == null)
      return null + delimiter;

    // Process left and right recursively 
    String leftSerialize = serialize(root.left);
    String rightSerialize = serialize(root.right);

    return root.val + delimiter + leftSerialize + rightSerialize;
  }

  public static TreeNode deserialize(String s) {
    Queue<String> nodes = new LinkedList<>();
    nodes.addAll(Arrays.asList(s.split(",")));
    return deserializeHelper(nodes);
  }
  
  // Helper function deserialize recursively 
  public static TreeNode deserializeHelper(Queue<String> nodes) {
    String valueForNode = nodes.poll();
    
    if (valueForNode.equals("null")) {
      return null;
    }
    TreeNode newNode = new TreeNode(Integer.valueOf(valueForNode));

    newNode.left = deserializeHelper(nodes);
    newNode.right = deserializeHelper(nodes);

    return newNode;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);

    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(5);

    String s = serialize(root);
    TreeNode d = deserialize(s);

    System.out.println(s);

    // Node val from original tree
    int before = root.right.left.val;

    // Node val from deserilized tree
    int after = d.right.left.val;

    System.out.println(before == after);
  }

  // Tree representation
    //   1
    //  / \
    // 2   3
    //    / \
    //   4   5
}
