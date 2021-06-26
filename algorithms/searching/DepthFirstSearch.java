import java.util.*;

public class DepthFirstSearch {

  public static void dfs(Map<Integer, ArrayList<Integer>> graph, Integer start) {
    Stack<Integer> stack = new Stack<>();
    Set<Integer> visited = new HashSet<>();

    stack.push(start);

    while (!stack.isEmpty()) {
      Integer current = stack.pop();

      if (!visited.contains(current)) {
        System.out.println(current);
        visited.add(current);
      }

      for (Integer childNode : graph.get(current)) {
        if (!visited.contains(childNode)) {
          stack.add(childNode);
        }
      }
    }
  }

  // Depth first search using call stack
  public static void dfsRecursive(Map<Integer, ArrayList<Integer>> graph, Integer start, Set<Integer> visited) {
    if (visited == null) {
      visited = new HashSet<>();
    }

    if (!visited.contains(start)) {
      System.out.println(start);
      visited.add(start);
    }

    for (Integer childNode : graph.get(start)) {
      if (!visited.contains(childNode)) {
        dfsRecursive(graph, childNode, visited);
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
    System.out.println("DFS using our own stack");
    dfs(graph, 3);

    System.out.println("DFS using call stack");
    dfsRecursive(graph, 3, null);
  }
}
