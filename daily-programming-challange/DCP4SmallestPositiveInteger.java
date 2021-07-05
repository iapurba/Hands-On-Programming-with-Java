import java.util.*;

public class DCP4SmallestPositiveInteger {
  public static int findSmallestBruteForce(int[] array) {
    /*
     * Time complexity of this aprroach is O(nlog(n) + n) = O(nlog(n))
     * 
     * Sort function runs on O(nlog(n)) complexity
     * 
     * Scanning through the elements takes O(n) times
     */

    Arrays.sort(array);
    int smallest = 1;
    for (int i = 0; i < array.length; i++) {
      if (array[i] < smallest) {
        continue;
      } else if (array[i] == smallest) {
        smallest++;
      } else {
        break;
      }
    }
    return smallest;
  }

  public static int findSmallestBruteForce2(int[] array) {
    // This function runs on O(n) times, but space complexity increased
    // to O(n) times as it uses an additional HashMap with maximum n elements

    Set<Integer> seen = new HashSet<>();

    for (int i = 0; i < array.length; i++) {
      if (array[i] > 0) {
        seen.add(array[i]);
      }
    }
    int smallest = 1;

    while (true) {
      if (seen.contains(smallest)) {
        smallest++;
      } else {
        break;
      }
    }
    return smallest;
  }

  public static int findSmallestOptimal(int[] array) {
    /*
     * This solution runs on O(n) time and O(1) space complexity
     * 
     * Here we are interesed only in +ve intergers which is less that the length of
     * the input array as we know any integer greater than the array's length cannot
     * be the smllest missing +ve integer.
     * 
     * So we initialize a counter = 0, iterate through each element and put them in
     * respective indices which satisfiy the above conditions.
     * 
     * Here we are using 0 base index so we are putting an element in the position
     * of (element - 1) e.g 1 goes to index of 0;
     */
    int c = 0;
    while (c != array.length) {
      if (array[c] > 0 && array[c] < array.length && array[c] != (c + 1) && array[c] != array[array[c] - 1]) {
        swap(array, c, (array[c] - 1));
      } else {
        c++;
      }
    }
    /*
     * Finally we scan though the array once again and comparing index and the value
     * if value != (index + 1), then obviously the current value is missing so just
     * return it. other wise return (length of array + 1)
     * 
     */
    for (int i = 0; i < array.length; i++) {
      if (i == (array[i] - 1)) {
        continue;
      } else {
        return (i + 1);
      }
    }
    return array.length + 1;
  }

  public static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public static void main(String[] args) {
    int[] array = { 4, 3, 2, -6, 5, 0, 1, 7, -1, 2, 4, -3 };

    System.out.println("\nOptimal solution\n");
    System.out.print("input:" + Arrays.toString(array));
    System.out.println("output:" + findSmallestOptimal(array));

    System.out.println("\nBrute force solutions\n");
    System.out.print("input:" + Arrays.toString(array));
    System.out.println(" output:" + findSmallestBruteForce(array));

    System.out.print("input:" + Arrays.toString(array));
    System.out.println(" output:" + findSmallestBruteForce2(array));

  }
}
