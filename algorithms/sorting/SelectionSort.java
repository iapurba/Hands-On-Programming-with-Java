import java.util.Arrays;

public class SelectionSort {

  public static int[] selectionSort(int[] array) {
    int minIdx;

    for (int i = 0; i < array.length; i++) {
      minIdx = i;

      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[minIdx]) {
          minIdx = j;
        }
      }

      int temp = array[minIdx];
      array[minIdx] = array[i];
      array[i] = temp;
    }
    return array;
  }

  public static void main(String[] args) {
    
    int[] nums = { 5, 6, 1, 3, 2, 4, 9, 8, 7 };

    int[] sortedNums = selectionSort(nums);

    System.out.println(Arrays.toString(sortedNums));
  }
}
