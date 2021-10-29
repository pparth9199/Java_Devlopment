package dungeon;

import java.util.ArrayList;
import java.util.List;

public class Graph {
  private int num_nodes;
  private List<Edge> edgelist = new ArrayList<Edge>(); // Edgelist stores the edges of MST
  private List<Integer> parent;
  private List<Integer> rank;
  private List<Edge> discardedEdges = new ArrayList<Edge>();

  Graph(int num_nodes) {
    this.num_nodes = num_nodes;
    parent = new ArrayList<Integer>(num_nodes);
    rank = new ArrayList<Integer>(num_nodes);
  }

  public void AddEdge(Edge e) {
    edgelist.add(e);
  }

  public int FindParent(int node) {

    if (node == parent.get(node)) {
      return node;
    }
    return FindParent(parent.get(node));
  }

  // Funtion implements Kruskal's algorithm and finds the minimum spanning tree.
  public void KruskalMST(List<Edge> result) {

    for (int i = 0; i < num_nodes; i++) {
      parent.add(i, i); // Initially set every node as the parent of itself.
      rank.add(i, 0); // Initial rank of each node is 0.
    }

    // Lambda expression to sort the edges based on their weights
    edgelist.sort((Edge e1, Edge e2) -> e1.GetWeight() - e2.GetWeight());

    for (Edge e : edgelist) {

      int root1 = FindParent(e.node_start);
      int root2 = FindParent(e.node_end);
      // Union by rank technique to find minimum spanning tree.
      if (root1 != root2) {
        result.add(e);
        if (rank.get(root1) < rank.get(root2)) {
          parent.set(root1, root2);
          rank.set(root2, rank.get(root2) + 1);
        } else {
          parent.set(root2, root1);
          rank.set(root1, rank.get(root1) + 1);
        }
      } else {
        this.discardedEdges.add(e);
      }
    }
  }

}
