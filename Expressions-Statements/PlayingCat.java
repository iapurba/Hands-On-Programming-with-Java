public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer && (temperature >=25 && temperature <= 45)) {
            return true;
        }
        else return !summer && (temperature >= 25 && temperature <= 35);
    }
}
