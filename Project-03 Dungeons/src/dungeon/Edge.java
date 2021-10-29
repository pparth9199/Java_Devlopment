package dungeon;

public class Edge {
  int node_start;
  int node_end;
  int weight;

  Edge(int node1, int node2) {
    node_start = node1;
    node_end = node2;
    weight = (int) Math.floor(Math.random() * (200) + 0);
  }

  public int GetWeight() {
    return weight;
  }
}
