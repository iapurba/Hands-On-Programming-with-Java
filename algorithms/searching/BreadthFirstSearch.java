import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BreadthFirstSearch {
  
  public static void bfs(Map<Integer, ArrayList<Integer>> graph, Integer start) {
    Queue<Integer> queue = new LinkedList<>();

    // Add start to the search 
    queue.add(start);

    HashSet<Integer> visited = new HashSet<>();

    while (!queue.isEmpty()) {
      // Pull a node
      Integer current = queue.remove();

      // Process if not seen
      if (!visited.contains(current)) {
          System.out.println(current);
          visited.add(current);
      }

      // Add unseen node
      for (Integer node : graph.get(current)) {
        if (!visited.contains(node)) {
          queue.add(node);
        }
      }
    }
  }

  public static void main(String[] args) {

    Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
    graph.put(1, new ArrayList<>());
    graph.put(2, new ArrayList<>());
    graph.put(3, new ArrayList<>());
    graph.put(4, new ArrayList<>());
    graph.put(5, new ArrayList<>());
    graph.put(6, new ArrayList<>());

    // Adding edges 
    graph.get(1).add(2);

    graph.get(2).add(1);
    graph.get(2).add(3);
    graph.get(2).add(4);

    graph.get(3).add(2);
    graph.get(3).add(4);
    graph.get(3).add(5);

    graph.get(4).add(2);
    graph.get(4).add(3);
    graph.get(4).add(6);

    graph.get(5).add(3);

    graph.get(6).add(4);

    // Start seaching 
    bfs(graph, 3);
  }
}
