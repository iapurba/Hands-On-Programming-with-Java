import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  
  public static ArrayList<String> readValues() {
    ArrayList<String> values = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    int index = 0;

    System.out.println("Choose\n" + "1 - to enter a string\n" + "0 - to quit");

    while (!quit) {
      System.out.println("Choose an option: ");
      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 0:
         quit = true;
         break;
        
        case 1:
          System.out.println("Enter a string: ");
          String stringInput = scanner.nextLine();
          values.add(index, stringInput);
          index++;
          break;
      }
    }
    scanner.close();

    return values;
  }

  public static void saveObject(ISaveable obj) {
    for (int i=0; i < obj.write().size(); i++) {
      System.out.println("Saving " + obj.write().get(i) + " to storage device");
    }
  }

  public static void loadObject(ISaveable obj) {
    ArrayList<String> values = readValues();
    obj.read(values);
  }

  // Main method
  public static void main(String[] args) {
    Player nick = new Player("Nick", 1, 2, "sowrd");
    System.out.println(nick);

    saveObject(nick);
    loadObject(nick);

    ISaveable werewolf = new Monster("Worewolf", 20, 30);
    saveObject(werewolf);
  }
}
