public class PhoneMain {
  public static void main(String[] args) {
    ITelephone myPhone;

    myPhone = new DeskPhone("033-1234-1234");

    myPhone.powerOn();
    myPhone.dial("8972829729");
    myPhone.answer();
    myPhone.isRinging();

    myPhone = new CellPhone("9876543210");
    
    myPhone.powerOn();
    myPhone.dial("8972829729");
    myPhone.answer();
    myPhone.isRinging();
  }
}
