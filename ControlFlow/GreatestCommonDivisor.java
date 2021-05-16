public class GreatestCommonDivisor {
    public static int getGCD(int n1, int n2) {
        if (n1 < 10 || n2 < 10) return -1;
        int gcd = 1;
        if (n1 < n2) {
            for (int i = 1; i <= n1; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    gcd = i;
                }
            }
        }
        else {
            return getGCD(n2, n1);
        }
        return gcd;
    }

    public static void main(String[] args) {
        System.out.println(getGCD(24, 12));
    }
}
