import java.util.HashMap;

public class DCP7DecodeWays {
  public static int numDecodingDP(String s) {
    HashMap<Integer, Integer> cache = new HashMap<>();
    return numDecodingHelper(0, s, cache);
  }

  public static int numDecodingHelper(int i, String s, HashMap<Integer, Integer> cache) {
    if (i >= s.length()) {
      return 1;
    }
    int ways = 0;
    int num1 = Character.getNumericValue(s.charAt(i));
    int num2 = (i != s.length() - 1)
        ? (Character.getNumericValue(s.charAt(i)) * 10) + Character.getNumericValue(s.charAt(i + 1))
        : 0;
    if (num1 > 0 && num1 <= 9) {
      if (cache.containsKey(i + 1)) {
        ways += cache.get(i + 1);
      } else {
        ways += numDecodingHelper(i + 1, s, cache);
        cache.put(i + 1, ways);
      }

    }
    if (num2 >= 10 && num2 <= 26) {
      if (cache.containsKey(i + 2)) {
        ways += cache.get(i + 2);
      } else {
        ways += numDecodingHelper(i + 2, s, cache);
        cache.put(i + 2, ways);
      }
    }
    return ways;
  }

  public static void main(String[] args) {

    System.out.println(numDecodingDP("33"));
    System.out.println(numDecodingDP("9"));
    System.out.println(numDecodingDP("0"));
    System.out.println(numDecodingDP("1125"));
    System.out.println(numDecodingDP("1125"));
    System.out.println(numDecodingDP("123"));
  }
}
