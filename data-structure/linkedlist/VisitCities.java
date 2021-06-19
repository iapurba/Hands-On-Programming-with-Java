import java.util.Iterator;
import java.util.LinkedList;

public class VisitCities {
  public static void main(String[] args) {
    LinkedList<String> cityToVisit = new LinkedList<String>();

    cityToVisit.add("Kolkata");
    cityToVisit.add("Noida");
    cityToVisit.add("Delhi");
    cityToVisit.add("Jaipur");
    cityToVisit.add("Pune");
    cityToVisit.add("Mumbai");
    cityToVisit.add("Bangalore");
    cityToVisit.add("Hyderabad");

    printVisitList(cityToVisit);

    cityToVisit.add(6, "Chennai");

    printVisitList(cityToVisit);

    cityToVisit.remove(1);

    printVisitList(cityToVisit);
  }

  private static void printVisitList(LinkedList<String> linkedlist) {
    Iterator<String> i = linkedlist.iterator();

    while(i.hasNext()) {
      System.out.println("Now visiting: " + i.next());
    }

    System.out.println("-----------------------");
  }
}
