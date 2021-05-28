public class Contact {
    private String name;
    private String phoneNo;

    public Contact(String name, String phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNo() {
        return this.phoneNo;
    }

    public static Contact createContact(String name, String phoneNo) {
        return new Contact(name, phoneNo);
    }
}
