import java.util.Arrays;

public class QuickSort {

  public static int[] quickSort(int[] array, int left, int right) {
    if (left < right) {
      int partitionIndex = getPartitionIndex(array, left, right);

      // Recursively call left and right subarray to the partitionIndex 
      quickSort(array, left, partitionIndex-1);
      quickSort(array, partitionIndex+1, right);
    }
    return array;
  }

  // Helper method to find the final resting position of the pivot
  public static int getPartitionIndex(int[] array, int left, int right) {

    // Select right most value as pivot
    int pivot = array[right];
    int i = left;
    
    // Rearrange the array such that,
    // Elements smaller than the pivot are at left to the pivot 
    // Element greater than the pivot are at right to the pivot 
    for (int j = i; j < right; j++) {
      if (array[j] < pivot) {
        swap(array, i, j);
        i++;
      }
    }
    swap(array, i, right);
    return i;
  }

  // Helper method to swap to elements 
  public static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public static void main(String[] args) {
    int[] nums = {5, 6, 1, 3, 2, 4, 9, 8, 7};

    int[] sortedNums = quickSort(nums, 0, nums.length-1);

    System.out.println(Arrays.toString(sortedNums));
  }
}