import java.util.*;

public class BinarySearchTree {
  private class Node {
    int key;
    Node left, right;

    public Node(int keyValue) {
      key = keyValue;
      left = right = null;
    }
  }

  private Node root;

  public BinarySearchTree() {
    this.root = null;
  }

  // Insert a new node
  public void insert(int key) {
    if (this.root == null) {
      this.root = new Node(key);
      return;
    }
    insertKey(this.root, key);
  }

  // Helper method to find the corret position where to be added,
  // And then add the to the found position
  private Node insertKey(Node root, int key) {
    if (root == null) {
      root = new Node(key);
      return root;
    }
    if (key < root.key) {
      root.left = insertKey(root.left, key);
    } else if (key > root.key) {
      root.right = insertKey(root.right, key);
    }
    return root;
  }

  public Node getRoot() {
    System.out.println(this.root.key);
    return this.root;
  }

  // Breadth first tarversal
  // Visit node level by level
  public void bfs() {
    if (this.root == null)
      return;

    Queue<Node> queue = new LinkedList<>();
    queue.add(this.root);

    while (!queue.isEmpty()) {
      Node current = queue.remove();
      System.out.println(current.key);

      if (current.left != null)
        queue.add(current.left);
      if (current.right != null)
        queue.add(current.right);
    }
  }

  // Depth first traversal
  public void preorder() {
    preorderRecursive(this.root);
  }

  public void inroder() {
    inroderRecursive(this.root);
  }

  public void postorder() {
    postorderRecursive(this.root);
  }

  // Helper function to visite node recursively,
  // Visit the node then the left child then the right child: nlr policy
  private void preorderRecursive(Node root) {
    if (root == null)
      return;

    System.out.println(root.key);

    if (root.left != null) {
      preorderRecursive(root.left);
    }
    if (root.right != null) {
      preorderRecursive(root.right);
    }
  }

  // Helper function to visit node recursively,
  // Visit the left child, then the node then the right child: lnr policy
  private void inroderRecursive(Node root) {
    if (root == null)
      return;

    if (root.left != null) {
      inroderRecursive(root.left);
    }
    System.out.println(root.key);

    if (root.right != null) {
      inroderRecursive(root.right);
    }
  }

  // Helper function to visit node recursively,
  // Visit the left child then the right child then the node: lrn policy
  private void postorderRecursive(Node root) {
    if (root == null)
      return;

    if (root.left != null) {
      postorderRecursive(root.left);
    }
    if (root.right != null) {
      postorderRecursive(root.right);
    }

    System.out.println(root.key);
  }
}
