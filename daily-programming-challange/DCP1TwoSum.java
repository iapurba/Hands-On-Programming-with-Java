import java.util.*;

public class DCP1TwoSum {
  /*
   * Given a list of numbers and a number k, return whether any two numbers from
   * the list add up to k.
   * 
   * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is
   * 17.
   */

  public static boolean twoSum(int[] array, int target) {
    Set<Integer> seen = new HashSet<>();

    for (int i = 0; i < array.length; i++) {
      if (seen.contains(array[i])) {
        return true;
      } else {
        // Add second number which is needed against current number
        // to add up to the targer
        seen.add(target - array[i]);
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] nums = { 10, 15, 3, 7 };

    System.out.println(twoSum(nums, 17)); // return true
    System.out.println(twoSum(nums, 19)); // return false
  }
}
