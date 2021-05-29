public class PerfectNumber {
    public static boolean isPerfectNumber(int num) {
        if (num < 1) return false;
        int sumOfDivisors = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
                System.out.println("factor: " + i);
            }
        }
        return sumOfDivisors == num;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(10));
    }
}
