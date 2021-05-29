public class NumberToWords {
    public static int reverse(int num) {
        int reverseNum = 0;
        while (num != 0) {
            int currentDigit = num % 10;
            reverseNum = (reverseNum * 10) + currentDigit;
            num /= 10;
        }
        return reverseNum;
    }
    public static int getDigitCount(int num) {
        if (num < 0) return -1;
        if (num == 0) return 1;
        int count = 0;
        while (num != 0) {
            count += 1;
            num /= 10;
        }
        return count;
    }
    public static void numberToWords(int num) {
        if (num < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int reversed = reverse(num);
            int originalDigitCount = getDigitCount(num);
            for (int i = 0; i < originalDigitCount; i++) {
                int digit = reversed % 10;
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reversed /= 10;
            }
        }
    }
    public static void main(String[] args) {
        numberToWords(1010);
    }
}
