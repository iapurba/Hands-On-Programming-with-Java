import java.util.InputMismatchException;
import java.util.Scanner;

public class EAFPvsLBYL {

  // EAFP: Easier to Ask for Forgivness than Persmissions.
  // Try running some code, expect it to work, if it doesn't catch the exception,
  // and then handling the corrective code on the exception block

  // LBYL: Look Before You Leap.
  // As its name suggest, in this approach, we first check what we are about to
  // use

  public static int getIntLBYL() {
    Scanner s = new Scanner(System.in);
    boolean isValid = true;
    System.out.println("Please enter an integer:");
    String input = s.next();

    for (int i = 0; i < input.length(); i++) {
      if (!Character.isDigit(input.charAt(i))) {
        isValid = false;
        break;
      }
    }
    if (isValid) {
      return Integer.parseInt(input);
    }
    System.out.println("Invalid input");
    return 0;
  }

  public static int getIntEAFP() {
    Scanner s = new Scanner(System.in);
    System.out.println("Please enter an integer:");
    try {
      return s.nextInt();
    } catch (InputMismatchException e) {
      System.out.println(e);
      return 0;
    }
  }

  public static int divideLBYL(int x, int y) {
    if (y == 0) {
      return 0;
    } else {
      return x / y;
    }
  }

  public static int divideEAFP(int x, int y) {
    try {
      return x / y;
    } catch (ArithmeticException e) {
      System.out.println(e);
      return 0;
    }
  }

  public static void main(String[] args) {
    int x = getIntEAFP();
    System.out.println("x = " + x);
    int y = getIntLBYL();
    System.out.println("y = " + y);

    System.out.println("x / y = " + divideEAFP(x, y));
  }
}
