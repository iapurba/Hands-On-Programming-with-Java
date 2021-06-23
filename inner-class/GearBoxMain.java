public class GearBoxMain {
  // Main method
  public static void main(String[] args) {
    GearBox mcLaren = new GearBox(6);

    mcLaren.operateClutch(true);
    mcLaren.changeGear(1);
    mcLaren.operateClutch(false);
    System.out.println(mcLaren.wheelSpeed(1000));

    // mcLaren.operateClutch(true);
    mcLaren.changeGear(2);
    System.out.println(mcLaren.wheelSpeed(3000));

    mcLaren.operateClutch(true);
    mcLaren.changeGear(3);
    mcLaren.operateClutch(false);
    System.out.println(mcLaren.wheelSpeed(6000));

  }
}
