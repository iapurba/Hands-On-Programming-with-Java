public class DCP9LargestSumNonAdjacent {

  public static int largestSumDP(int[] nums) {
    int include = 0;
    int exclude = 0;

    for (int i = 0; i < nums.length; i++) {
      int temp = include;
      include = Math.max(exclude + nums[i], include);
      exclude = temp;
    }
    return include;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 4, 6, 2, 5 };
    int[] nums2 = { 5, 1, 1, 5 };
    int[] nums3 = { 5, 1, 3, -2, -6, 3, 0, -1, 5, -3, -2, 1 };

    System.out.println(largestSumDP(nums));
    System.out.println(largestSumDP(nums2));
    System.out.println(largestSumDP(nums3));
  }
}
