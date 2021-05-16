public class SumOddRange {
    public static boolean isOdd(int num) {
        if (num < 0) {
            return false;
        }
        else return (num % 2 != 0);
    }
    public static int sumOdd(int start, int end) {
        if (start <= 0 || end <= 0 || start > end) return -1;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isOdd(2));
    }
}
