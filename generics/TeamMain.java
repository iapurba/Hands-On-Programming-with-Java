public class TeamMain {
  public static void main(String[] args) {
    // Football team 
    Team<FootballPlayer> fcb = new Team<>("FC Barcelona");
    // Basketball team
    Team<BasketBallPlayer> bnets = new Team<>("Brooklyb nets");
    // Cricket team 
    Team<CricketPlayer> india = new Team<>("Indian test team");

    FootballPlayer messi = new FootballPlayer("L. Messi");
    CricketPlayer kohli = new CricketPlayer("V. Kohli");
    BasketBallPlayer durant = new BasketBallPlayer("K. Durant");

    fcb.addPlayer(messi);
    india.addPlayer(kohli);
    bnets.addPlayer(durant);

    System.out.println(fcb.getNumOfPlayer());
  }
}
