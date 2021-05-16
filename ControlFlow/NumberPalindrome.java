public class NumberPalindrome {
    public static boolean isPalindrome(int num) {
        int initialNum = Math.abs(num);
        num = initialNum;
        int reverse = 0;
        while (num > 0) {
            reverse = (reverse * 10) + (num % 10);
            num = num / 10;
        }
        return initialNum == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-11211));
    }
}
