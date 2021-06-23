import java.util.ArrayList;

public class GearBox {
  private ArrayList<Gear> gears;
  private int maxGear;
  private int currentGear = 0;
  private boolean clutchIsIn;

  public GearBox(int maxGear) {
    this.maxGear = maxGear;
    this.gears = new ArrayList<>();

    for (int i = 0; i < maxGear; i++) {
      addGear(i, i * 5.3);
    }
  }

  private void addGear(int gearNumber, double ratio) {
    if (gearNumber > 0 && gearNumber <= this.maxGear) {
      this.gears.add(new Gear(gearNumber, ratio));
    }
  }

  public void operateClutch(boolean in) {
    this.clutchIsIn = in;
  }

  public void changeGear(int newGear) {
    if ((newGear >= 0 && newGear < this.gears.size()) && this.clutchIsIn) {
      this.currentGear = newGear;
      System.out.println("Gear " + newGear + " selected.");
    } else {
      System.out.println("Grind!");
      this.currentGear = 0;
    }
  }

  public double wheelSpeed(int revs) {
    if (clutchIsIn) {
      System.out.println("Scream!");
      return 0.0;
    }
    return revs * this.gears.get(currentGear).getRatio();
  }

  // Inner class 
  private class Gear {
    int gearNumber;
    double ratio;

    Gear(int gearNumber, double ratio) {
      this.gearNumber = gearNumber;
      this.ratio = ratio;
    }

    double getRatio() {
      return this.ratio;
    }
  }
}
