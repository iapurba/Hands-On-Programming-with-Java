import java.util.ArrayList;

public class Team<T extends Player> {
  private String name;
  int played = 0;
  int won = 0;
  int draw = 0;
  int lost = 0;

  private ArrayList<T> members = new ArrayList<>();

  public Team(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public boolean addPlayer(T player) {
    if (members.contains(player)) {
      System.out.print(player.getName() + " already on this team");
      return false;
    }
    members.add(player);
    System.out.println(player.getName() + " picked for team " + this.name);
    return true;
  }

  public int getNumOfPlayer() {
    return this.members.size();
  }

  public void matchResult(Team<T> opponent, int ourPoints, int theirPoints) {
    if (ourPoints > theirPoints) {
      won++;
    } else if (ourPoints == theirPoints) {
      draw++;
    } else {
      if (opponent != null) {
        opponent.matchResult(null, theirPoints, ourPoints);
      }
    }
  }
}
