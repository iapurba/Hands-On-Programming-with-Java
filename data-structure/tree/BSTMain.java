public class BSTMain {
  public static void main(String[] args) {
    BinarySearchTree tree = new BinarySearchTree();

    // Insering value 
    tree.insert(8);
    tree.insert(12);
    tree.insert(14);
    tree.insert(13);
    tree.insert(9);
    tree.insert(5);
    tree.insert(2);
    tree.insert(6);
    tree.insert(1);
    tree.insert(3);
    tree.insert(7);
    tree.insert(15);

    System.out.println(tree.getRoot());
    // Breadth first traversal 
    System.out.println("Breadth first traversal: ");
    tree.bfs();

    // Depth first traversal 
    System.out.println("Depth first traversal - preorder: ");
    tree.preorder();
    System.out.println("Depth first traversal - inorder: ");
    tree.inroder();
    System.out.println("Depth first traversal - postorder: ");
    tree.postorder();
  }
}
