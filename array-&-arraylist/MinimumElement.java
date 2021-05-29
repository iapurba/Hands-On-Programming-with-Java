import java.util.Scanner;

public class MinimumElement {
    private static final Scanner scanner = new Scanner(System.in);

    private static int readInteger() {
        System.out.println("Enter count: ");
        return scanner.nextInt();
    }

    private static int[] readElements(int size) {
        System.out.println("Enter " + size + " numbers: ");
        int[] array = new int[size];
        for (int i=0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i=1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int count = readInteger();
        int[] array = readElements(count);
        System.out.println("Min element is: " + findMin(array));
    }
}
