import java.util.Arrays;

public class HeapMain {
  public static void main(String[] agrs) {
    
    MinHeap minHeap = new MinHeap(10);
    MaxHeap maxHeap = new MaxHeap(6);

    minHeap.insert(5);
    minHeap.insert(4);
    minHeap.insert(13);
    minHeap.insert(10);
    minHeap.insert(12);
    minHeap.insert(17);
    minHeap.insert(2);
    minHeap.insert(6);
    minHeap.insert(7);
    
    System.out.println("\nMin Heap\n");
    System.out.println("Min Heap: " + Arrays.toString(minHeap.getItems()));
    System.out.print("After poll: ");
    minHeap.poll();
    System.out.println(Arrays.toString(minHeap.getItems()));
    System.out.print("After remove item from index 4: ");
    minHeap.remove(4);
    System.out.println(Arrays.toString(minHeap.getItems()));

    System.out.println("\nMax Heap\n");
    maxHeap.insert(5);
    maxHeap.insert(4);
    maxHeap.insert(13);
    maxHeap.insert(10);
    maxHeap.insert(12);
    maxHeap.insert(17);
    maxHeap.insert(2);
    maxHeap.insert(6);
    maxHeap.insert(7);

    System.out.println("Max Heap: " + Arrays.toString(maxHeap.getItems()));
    System.out.print("After poll: ");
    maxHeap.poll();
    System.out.println(Arrays.toString(maxHeap.getItems()));
    System.out.print("After remove item from index 4: ");
    maxHeap.remove(4);
    System.out.println(Arrays.toString(maxHeap.getItems()));
  }
}
