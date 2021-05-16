public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int num) {
        if (num < 0) return -1;
        int firstDigit = num % 10;
        int lastDigit = 0;
        while( num > 0) {
            lastDigit = num % 10;
            num = num / 10;
        }
        return firstDigit + lastDigit;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-11));
    }
}
