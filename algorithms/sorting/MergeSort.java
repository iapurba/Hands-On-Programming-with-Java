import java.util.Arrays;

public class MergeSort {

  public static int[] mergeSort(int[] array) {
    int left = 0;
    int right = array.length - 1;

    if (left < right) {
      int mid = (left + right) / 2;

      int l = mid + 1;
      int r = right - mid;

      int[] leftArray = new int[l];
      int[] rightArray = new int[r];

      for (int i = 0; i < l; i++) {
        leftArray[i] = array[i];
      }

      for (int i = 0; i < r; i++) {
        rightArray[i] = array[l + i];
      }

      // Recursively sort left and right subarray, and merge them 
      return merge(mergeSort(leftArray), mergeSort(rightArray));
    }
    return array;
  }

  // Helper method to merge two sorted arrays 
  public static int[] merge(int[] array1, int[] array2) {
    int[] mergedArray = new int[array1.length + array2.length];

    int i = 0;
    int j = 0;
    int k = 0;

    // Compare elements of array1 and array2
    // And put them to the mergedArray in order 
    while (i < array1.length && j < array2.length) {
      if (array1[i] < array2[j]) {
        mergedArray[k++] = array1[i++];
      } else {
        mergedArray[k++] = array2[j++];
      }
    }

    // Insert rest of the elements of array1 to mergedArray 
    while (i < array1.length) {
      mergedArray[k++] = array1[i++];
    }

    // Insert rest of the elements of array2 to mergedArray;
    while (j < array2.length) {
      mergedArray[k++] = array2[j++];
    }

    return mergedArray;
  }

  public static void main(String[] args) {

    int[] nums = {2};

    int[] sortedNums = mergeSort(nums);

    System.out.println(Arrays.toString(sortedNums));
  }
}
