public class Sum3And5 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 ==0 && i % 5 == 0) {
                System.out.println("found number: " + i);
                sum += i;
                count ++;
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("sum: " + sum);
    }
}
