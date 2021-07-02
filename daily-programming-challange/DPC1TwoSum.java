import java.util.*;

public class DPC1TwoSum {

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
