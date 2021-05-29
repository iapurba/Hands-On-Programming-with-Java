public class IntEqualityPrinter {
    public static void printEqual(int n1, int n2, int n3) {
        if (n1 < 0 || n2 < 0 || n3 < 0) {
            System.out.println("Invalid Value");
        }
        else if (n1 == n2 && n2 == n3) {
            System.out.println("All numbers are equal");
        }
        else if (n1 != n2 && n2 != n3 && n1  != n3) {
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different");
        }
    }
}
