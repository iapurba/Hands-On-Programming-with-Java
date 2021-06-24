public class MyLinkedList implements NodeList {
  private ListItem root = null;

  public MyLinkedList(ListItem root) {
    this.root = root;
  }

  @Override
  public ListItem getRoot() {
    return this.root;
  }

  @Override
  public boolean addItem(ListItem newItem) {
    if (this.root == null) {
      this.root = newItem;
      return true;
    }

    ListItem current = this.root;

    while (current != null) {
      int comparison = current.compareTo(newItem);

      if (comparison < 0) {
        // New item is greater, move right if possible
        if (current.next() != null) {
          current = current.next();
        } else {
          current.setNext(newItem);
          newItem.setPrevious(current);
          return true;
        }
      } else if (comparison > 0) {
        // New item is less, insert before
        if (current.previous() != null) {
          current.previous().setNext(newItem);
          newItem.setPrevious(current.previous());
          newItem.setNext(current);
          current.setPrevious(newItem);
        } else {
          // The node with a previous is root
          newItem.setNext(this.root);
          this.root.setPrevious(newItem);
          this.root = newItem;
        }
        return true;
      } else {
        System.out.println(newItem.getValue() + " is already present, not added.");
        return false;
      }
    }
    return false;
  }

  @Override
  public boolean removeItem(ListItem item) {
    if (item != null) {
      System.out.println("Deleting item " + item.getValue());
    }

    ListItem current = this.root;

    while (current != null) {
      int comparison = current.compareTo(item);

      if (comparison == 0) {
        // Item found
        if (current == this.root) {
          this.root = current.next();
        } else {
          current.previous().setNext(current.next());

          if (current.next() != null) {
            current.next().setPrevious(current.previous());
          }
        }
        return true;
      } else if (comparison < 0) {
        // Item yet to be found 
        current = current.next();
      } else {
        System.out.println(item.getValue() + " is not in the list.");
        return false;
      }
    }
    return false;
  }

  @Override
  public void traverse(ListItem root) {
    if (root == null) {
      System.out.println("List is empty.");
      return;
    }

    while (root != null) {
      System.out.println(root.getValue());
      root = root.next();
    }
  }

}
