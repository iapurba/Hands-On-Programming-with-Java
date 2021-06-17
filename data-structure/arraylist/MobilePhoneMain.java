import java.util.Scanner;

public class MobilePhoneMain {
  private static Scanner s = new Scanner(System.in);
  public static MobilePhone mobilePhone = new MobilePhone("9876543210");

  private static void startPhone() {
    System.out.println("Starting phone...");
    System.out.println("Your contact No: " + mobilePhone.getMyNumber());
  }

  private static void printActions() {
    System.out.println("Available actions:\npress");
    System.out.println("0 - to shutdown\n" 
        + "1 - to print contacts\n" 
        + "2 - to add a new contact\n"
        + "3 - to update an existing contact\n"
        + "4 - to remove an existing contact\n"
        + "5 - to query if a contact exists or not\n"
        + "6 - to print list of available actions\n"
    );
    System.out.println("Choose your action: ");

  }

  private static void addConctact() {
    System.out.println("Enter conact name: ");
    String contactName = s.nextLine();
    System.out.println("Enter phone number:");
    String phoneNo = s.nextLine();

    Contact newContact = Contact.createContact(contactName, phoneNo);

    if (mobilePhone.addNewContact(newContact)) {
      System.out.println("New contact added");
    }
    else {
      System.out.println("Cannot add, " + contactName + " already exists on file.");
    }
  }

  private static void updateContact() {
    System.out.println("Enter the contact name you want to update: ");
    String oldContactName = s.nextLine();

    Contact existingContact = mobilePhone.queryContact(oldContactName);

    if (existingContact == null) {
      System.out.println("Contact not found!");
      return;
    }

    System.out.println("Enter new contact name to update: ");
    String newContactName = s.nextLine();
    System.out.println("Enter new mobile no to update: ");
    String newPhoneNo = s.nextLine();

    Contact updatedContact = Contact.createContact(newContactName, newPhoneNo);

    if (mobilePhone.updateContact(existingContact, updatedContact)) {
      System.out.println(oldContactName + " has been updated.");
    }
  }

  private static void removeContact() {
    System.out.println("Enter contact name you want to delete: ");
    String oldContactName = s.nextLine();

    Contact existingContact = mobilePhone.queryContact(oldContactName);

    if (existingContact == null) {
      System.out.println(oldContactName + "is not found.");
      return;
    }

    mobilePhone.removeContact(existingContact);
    System.out.println(oldContactName + " has been deleted.");
  }

  private static void queryContact() {
    System.out.println("Enter contact name you want to search for: ");
    String contactNameToSearchFor = s.nextLine();

    Contact existingContact = mobilePhone.queryContact(contactNameToSearchFor);

    if (existingContact == null) {
      System.out.println(contactNameToSearchFor + "not found.");
      return;
    }

    System.out.println("Contact name: " + existingContact.getName() 
        + "\nPhone no: " + existingContact.getPhoneNo()
    );
  }

  public static void main(String[] args) {
    boolean quit = false;
    startPhone();
    printActions();
    
    while (!quit) {
      System.out.println("press 6 to show all available actions");
      int action = s.nextInt();
      s.nextLine();

      switch (action) {
        case 0:
          System.out.println("Shutting down...");
          quit = true;
          break;
        
        case 1:
          mobilePhone.printContacts();
          break;

        case 2:
          addConctact();
          break;
        
        case 3:
          updateContact();
          break;

        case 4:
          removeContact();
          break;

        case 5:
          queryContact();
          break;
        
        case 6:
          printActions();
          break;
        
        default:
          System.out.println("Please choose from the bellow options");
          printActions();
          break;

      }
    }
  }
}
