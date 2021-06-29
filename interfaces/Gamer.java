import java.util.ArrayList;
import java.util.List;

public class Gamer implements ISaveable{
  private String name;
  private int hitPoints;
  private int strength;
  private String weapon;

  public Gamer(String name, int hitPoints, int strength, String weapon) {
    this.name = name;
    this.hitPoints = hitPoints;
    this.strength = strength;
    this.weapon = weapon;
  }

  @Override
  public List<String> write() {
    List<String> values = new ArrayList<>();

    values.add(0, this.name);
    values.add(1, "" + this.hitPoints);
    values.add(2, "" + this.strength);
    values.add(3, this.weapon);

    return values;
  }

  @Override
  public void read(List<String> savedValues) {
    if (savedValues != null && savedValues.size() > 0) {
      this.name = savedValues.get(0);
      this.hitPoints = Integer.parseInt(savedValues.get(1));
      this.strength = Integer.parseInt(savedValues.get(2));
      this.weapon = savedValues.get(3);
    }
  }

  // Setter methods
  public void setName(String name) {
    this.name = name;
  }

  public void setHitPoints(int hitPoints){
    this.hitPoints = hitPoints;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  public void setWeapon(String weapon) {
    this.weapon = weapon;
  }

  // Getter methods
  public String getName() {
    return this.name;
  }

  public int getHitPoints() {
    return this.hitPoints;
  }

  public int strength() {
    return this.strength;
  }

  public String getWeapon() {
    return this.weapon;
  }

  @Override
  public String toString() {
    return "Gamer {" + "name='" + name + '\'' + ", hitpoints=" + hitPoints +
      ", strength=" + strength + ", weapon='" + weapon + '\'' + "}";
  }

}
