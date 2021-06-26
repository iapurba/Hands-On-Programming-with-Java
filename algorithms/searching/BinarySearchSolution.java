public class BinarySearchSolution {

  public static int binarySearch(int[] array, int target) {
    int left = 0;
    int right = array.length;

    while (left < right) {
      int mid = (left + right) / 2;
      int found = array[mid];

      if (found == target) {
        return target;
      }
      else if (found < target) {
        left = mid + 1;
      }
      else {
        right = mid - 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] nums = new int[10];

    for (int i = 0; i < nums.length; i++) {
      nums[i] = i;
    }

    int a = binarySearch(nums, 5);   // return 5;
    int b = binarySearch(nums, 15);  // return -1;

    System.out.println(a);
    System.out.println(b);
  }
}
