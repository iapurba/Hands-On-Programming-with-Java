import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] array) {
        int temp;
        int maxLength = array.length - 1;
        int halfLength = array.length / 2;
        for (int i=0; i < halfLength; i++) {
            temp = array[i];
            array[i] = array[maxLength];
            array[maxLength] =temp;
            maxLength--;
        }
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(myArray));
        reverse(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
