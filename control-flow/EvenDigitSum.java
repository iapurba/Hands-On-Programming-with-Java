public class EvenDigitSum {
    public static int getEvenDigitSum(int num) {
        if (num < 0) return -1;
        int sum = 0;
        while (num > 0) {
            int currentDigit = num % 10;
            sum += (currentDigit % 2 == 0) ? currentDigit : 0;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(12345622));
    }
}
