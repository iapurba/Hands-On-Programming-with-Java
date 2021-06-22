public class DeskPhone implements ITelephone {
  private String myNumber;
  private boolean isRinging;

  public DeskPhone(String myNumber) {
    this.myNumber = myNumber;
  }
  
  @Override
  public void powerOn() {
    System.out.println("No action taken, deskphone has no power button");
  }

  @Override
  public void dial(String phoneNumber) {
    System.out.println("Now ringing " + phoneNumber);
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
