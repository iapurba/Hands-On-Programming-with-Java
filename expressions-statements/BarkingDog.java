public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking ) {
            return (hourOfDay >= 0 && hourOfDay < 8) || hourOfDay == 23;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
    }
}
