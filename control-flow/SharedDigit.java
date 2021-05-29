public class SharedDigit {
    public static boolean hasSharedDigit(int n1, int n2) {
        if ((n1 < 10 || n1 > 99) || (n2 < 10 || n2 > 99)) return false;
        while (n1 > 0) {
            int currentFirstDigit = n1 % 10;
            int secondNum = n2;
            while (secondNum > 0) {
                int currentSecondDigit = secondNum % 10;
                if (currentSecondDigit == currentFirstDigit) return true;
                secondNum /= 10;
            }
            n1 /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 13));
    }
}
