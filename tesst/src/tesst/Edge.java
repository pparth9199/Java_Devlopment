package tesst;

import java.util.ArrayList;
import java.util.List;


class Graph {

  
  public void DisplayEdges(List<Edge> result) {
    int cost = 0;
    System.out.print("\nEdges of minimum spanning tree : ");
    for (Edge edge : result) {
      System.out.print("[" + edge.node_start + "-" + edge.node_end + "]-(" + edge.weight + ") ");
      cost += edge.weight;
    }
    System.out.println("\n Discarded edges : ");
    for (Edge ed : discardedEdges) {
      System.out.print("[" + ed.node_start + "-" + ed.node_end + "]-(" + ed.weight + ") ");
      cost += ed.weight;
    }
    System.out.println("\nCost of minimum spanning tree : " + cost);
  }

  public static void main(String args[]) {

    // Nodes (0, 1, 2, 3, 4, 5)
    
    g1.DisplayEdges(mst);

  }
}
