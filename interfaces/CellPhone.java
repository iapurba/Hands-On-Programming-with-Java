public class CellPhone implements ITelephone{
  private String myNumber;
  private boolean isRinging;
  private boolean isOn;

  public CellPhone(String myNumber) {
    this.myNumber = myNumber;
  }
  
  @Override
  public void powerOn() {
    isOn = true;
    System.out.println("Mobile phone powered on.");
  }

  @Override
  public void dial(String phoneNumber) {
    if (isOn) {
      System.out.println("Now ringing " + phoneNumber);
      return;
    }
    System.out.println("Cell phone is switched off");
  }

  @Override
  public void answer() {
    if (isRinging) {
      System.out.println("Andwering the deskphone");
      isRinging = false;
    }
  }

  @Override
  public boolean isRinging() {
    return isRinging;
  }

  public String getMyNumber() {
    return this.myNumber;
  }
}
