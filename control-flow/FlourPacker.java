public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        if (smallCount == 0) return (bigCount * 5) == goal;
        if (bigCount == 0) return smallCount >= goal;
        int bigPackUsed = bigCount;
        while (goal < bigPackUsed * 5) {
            bigPackUsed--;
        }
        return (goal - (bigPackUsed * 5)) <= smallCount;
    }
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(5, 3, 24));
    }
}
