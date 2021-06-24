public class MyLinkedListMain {
  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList(null);

    list.traverse(list.getRoot());

    String stringData = "Amhedabad Chennai Delhi Kolkata Mumbai Hyderabad Jaipur Pune Bangalore Delhi";

    String[] cityList = stringData.split(" ");

    for (String s : cityList) {
      list.addItem(new Node(s));
    }

    list.traverse(list.getRoot());

    list.removeItem(new Node("Jaipur"));
    // Traversing after removing 'Jaipur' 
    list.traverse(list.getRoot());

    // 'Noida' is not in the list 
    list.removeItem(new Node("Noida"));
    list.traverse(list.getRoot());
  }
}
