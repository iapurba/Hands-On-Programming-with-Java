import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    // Helper function to find the index of a contact,
    // taking an Contact object as a parameter
    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    // Overloaded
    // Helper function to find the index of an existed contact
    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already exists.");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPos = findContact(oldContact);
        if (foundPos < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }
        this.myContacts.set(foundPos, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPos = findContact(contact);
        if (foundPos < 0) {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }
        this.myContacts.remove(foundPos);
        System.out.println(contact.getName() + " has been deleted.");
        return true;
    }

    // This time it takes a contact name and return a Contact object
    public Contact queryContact(String contactName) {
        int foundPos = findContact(contactName);
        if (foundPos < 0) {
            return null;
        }
        return this.myContacts.get(foundPos);
    }

    // Print the list of all contacts 
    public void printContacts() {
        System.out.println("Contact list");
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact currentContact = this.myContacts.get(i);
            System.out.println(i + 1 + ". " + currentContact.getName() + ":" + currentContact.getPhoneNo());
        }
    }
}
