public class LastDigitChecker {
    public static boolean isValid(int num) {
        return num >= 10 && num <= 1000;
    }
    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        if (isValid(n1) && isValid(n2) && isValid(n3)) {
            int lastDigitOfn1 = n1 % 10;
            int lastDigitOfn2 = n2 % 10;
            int lastDigitOfn3 = n3 % 10;
            return (lastDigitOfn1 == lastDigitOfn2) || (lastDigitOfn2 == lastDigitOfn3) ||
                    (lastDigitOfn1 == lastDigitOfn3);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(12, 27, 13));
        System.out.println(isValid(12));
    }
}
