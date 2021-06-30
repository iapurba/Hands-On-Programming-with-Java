import java.util.Arrays;

public class MaxHeap {
  private int[] items;
  private int capacity;
  private int size = 0;

  public MaxHeap(int capacity) {
    this.capacity = capacity;
    this.items = new int[capacity];
  }

  public int peek() {
    if (size == 0)
      throw new IllegalStateException();
    return items[0];
  }

  public int poll() {
    if (size == 0)
      throw new IllegalStateException();
    int item = items[0];
    items[0] = items[size - 1];
    size--;
    heapifyDown(0);
    return item;
  }

  public void insert(int item) {
    ensureCapacity();
    items[size] = item;
    size++;
    heapifyUp();
  }

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

  // Helper methods
  private void ensureCapacity() {
    if (size == capacity) {
      items = Arrays.copyOf(items, capacity * 2);
      capacity *= 2;
    }
  }

  private void swap(int idx1, int idx2) {
    int temp = items[idx1];
    items[idx1] = items[idx2];
    items[idx2] = temp;
  }

  private void heapifyUp() {
    int idx = size - 1;
    while (hasParent(idx) && getParent(idx) < items[idx]) {
      swap(idx, getParentIndex(idx));
      idx = getParentIndex(idx);
    }
  }

  private void heapifyDown(int idx) {
    while (hasLeftChild(idx)) {
      int greaterChildIdx = getLeftChildIndex(idx);
      if (hasRightChild(idx) && getRightChild(idx) > getLeftChild(idx)) {
        greaterChildIdx = getRightChildIndex(idx);
      }

      if (items[idx] < items[greaterChildIdx]) {
        swap(idx, greaterChildIdx);
      } else {
        break;
      }

      idx = greaterChildIdx;
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
    return ((2 * idx) + 1);
  }

  private int getRightChildIndex(int idx) {
    return ((2 * idx) + 2);
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
}
