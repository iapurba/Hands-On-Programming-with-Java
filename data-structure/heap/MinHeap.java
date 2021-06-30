import java.util.Arrays;

public class MinHeap {
  private int[] items;
  private int capacity;
  private int size = 0;

  public MinHeap(int capacity) {
    this.capacity = capacity;
    this.items = new int[capacity];
  }

  // Peek the first item without removing it
  public int peek() {
    if (size == 0)
      throw new IllegalStateException();
    return items[0];
  }

  // Remove the first item
  public int poll() {
    if (size == 0)
      throw new IllegalStateException();
    int item = items[0];
    items[0] = items[size - 1];
    size--;
    heapifyDown(0);
    return item;
  }

  // Add an item to the heap
  public void insert(int item) {
    ensureCapacity();
    items[size] = item;
    size++;
    heapifyUp();
  }

  // Remove the item in given index
  public int remove(int idx) {
    if (size == 0 || idx < 0 || idx >= size) {
      throw new IllegalStateException();
    }
    int item = items[idx];
    items[idx] = items[size - 1];
    size--;
    heapifyDown(idx);
    return item;
  }

  public int[] getItems() {
    return this.items;
  }

  // Helper functions
  private void ensureCapacity() {
    if (size == capacity) {
      items = Arrays.copyOf(items, capacity * 2);
      capacity *= 2;
    }
  }

  private void heapifyUp() {
    int idx = size - 1;
    while (hasParent(idx) && getParent(idx) > items[idx]) {
      swap(getParentIndex(idx), idx);
      idx = getParentIndex(idx);
    }
  }

  private void heapifyDown(int idx) {
    while (hasLeftChild(idx)) {
      // Select left child as smallest
      int smallerChildIdx = getLeftChildIndex(idx);
      // If right child exist and smaller then left,
      // choose the right child as smallest
      if (hasRightChild(idx) && getRightChild(idx) < getLeftChild(idx)) {
        smallerChildIdx = getRightChildIndex(idx);
      }
      if (items[idx] > items[smallerChildIdx]) {
        swap(idx, smallerChildIdx);
      } else {
        break;
      }
      idx = smallerChildIdx;
    }
  }

  private boolean hasParent(int idx) {
    return ((idx - 1) / 2) >= 0;
  }

  private boolean hasLeftChild(int idx) {
    return ((2 * idx) + 1) < size;
  }

  private boolean hasRightChild(int idx) {
    return ((2 * idx) + 2) < size;
  }

  private int getParentIndex(int idx) {
    return (idx - 1) / 2;
  }

  private int getLeftChildIndex(int idx) {
    return (2 * idx) + 1;
  }

  private int getRightChildIndex(int idx) {
    return (2 * idx) + 2;
  }

  private int getParent(int idx) {
    return items[getParentIndex(idx)];
  }

  private int getLeftChild(int idx) {
    return items[getLeftChildIndex(idx)];
  }

  private int getRightChild(int idx) {
    return items[getRightChildIndex(idx)];
  }

  private void swap(int idx1, int idx2) {
    int temp = items[idx1];
    items[idx1] = items[idx2];
    items[idx2] = temp;
  }
}
