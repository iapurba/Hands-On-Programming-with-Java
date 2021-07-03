import java.util.Arrays;

public class DCP2ProductArray {
  /*
   * Given an array of integers, return a new array such that each element at
   * index i of the new array is the product of all the numbers in the original
   * array except the one at i.
   * 
   * For example, if our input was [1, 2, 3, 4, 5], the expected output would be
   * [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would
   * be [2, 3, 6].
   */

  public static int[] productExceptSelfBruteForce(int[] array) {
    int product = 1;
    int zeroCount = 0;
    for (int item : array) {
      if (item != 0)
        product *= item;
      else
        zeroCount++;
    }

    // If input array contains more than one 0
    if (zeroCount > 1) {
      for (int i = 0; i < array.length; i++) {
        array[i] = 0;
      }
    }

    // If input array contains only one 0
    if (zeroCount == 1) {
      for (int i = 0; i < array.length; i++) {
        if (array[i] == 0) {
          array[i] = product;
        } else {
          array[i] = 0;
        }
      }
    }

    // If input array contains no 0
    if (zeroCount == 0) {
      for (int i = 0; i < array.length; i++) {
        array[i] = product / array[i];
      }
    }
    return array;
  }

  // Solution without division
  public static int[] productExceptSelf(int[] array) {
    int product = 1;
    for (int i = 0; i < array.length; i++) {
      product *= array[i];
    }

    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (product * Math.pow(array[i], -1));
    }
    return array;
  }

  public static void main(String[] args) {
    // With no zero
    int[] input1 = { 1, 2, 3, 4, 5 };
    System.out.println("input: " + Arrays.toString(input1));
    int[] output1 = productExceptSelfBruteForce(input1);
    System.out.println("output: " + Arrays.toString(output1));

    // With one zero
    int[] input2 = { 1, 2, 3, 0, 5 };
    System.out.println("input: " + Arrays.toString(input2));
    int[] output2 = productExceptSelfBruteForce(input2);
    System.out.println("output: " + Arrays.toString(output2));

    // With multiple zero
    int[] input3 = { 1, 2, 0, 4, 0 };
    System.out.println("input: " + Arrays.toString(input3));
    int[] output3 = productExceptSelfBruteForce(input3);
    System.out.println("output: " + Arrays.toString(output3));

    // Without division
    System.out.println("\nWithout division");
    int[] input4 = { 1, 2, 3, 4, 5 };
    System.out.println("input: " + Arrays.toString(input4));
    int[] output4 = productExceptSelf(input4);
    System.out.println("output: " + Arrays.toString(output4));

  }
}
