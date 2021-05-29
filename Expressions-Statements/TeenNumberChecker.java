public class TeenNumberChecker {
    public static boolean isTeen(int num) {
        return num > 12 && num < 20;
    }
    public static boolean hasTeen(int num1, int num2, int num3) {
        return (isTeen(num1) || isTeen(num2) || isTeen(num3));
    }
}
