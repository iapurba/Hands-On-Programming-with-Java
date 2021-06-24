import java.util.Arrays;

public class BubbleSort {

  public static int[] bubbleSort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
    return array;
  }

  public static void main(String[] args) {
    
    int[] nums = { 5, 6, 1, 3, 2, 4, 9, 8, 7 };

    int[] sortedNums = bubbleSort(nums);

    System.out.println(Arrays.toString(sortedNums));
  }
}
