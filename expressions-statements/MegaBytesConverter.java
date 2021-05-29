public class MegaBytesConverter {
    public static void  printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int toMegaBytes = kiloBytes / 1024;
            int remainingKilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " +
                    toMegaBytes + " MB and " + remainingKilobytes + " KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(2500);
    }
}
