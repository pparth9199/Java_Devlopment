package dungeon;

import java.util.ArrayList;
import java.util.List;

public class DungeonClass implements Dungeon {
  private Player playerInDungeon;
  private ArrayList<Edge> mst;

  public DungeonClass() {
    int x = 6;
    int z = 8;
    int[][] x1 = new int[x][z];
    int num = 0;
    for (int i = 0; i < x; i++) {
      for (int j = 0; j < z; j++) {
        x1[i][j] = num;
        num++;
      }
    }
    int num_nodes = x * z;
    Graph g1 = new Graph(num_nodes);
    for (int i = 0; i < x; i++) {
      for (int j = 0; j < z; j++) {
        if (i == x - 1 & j == z - 1) {
          Edge e = new Edge(x1[i][j], x1[i][j]);
          g1.AddEdge(e);
          break;
        } else if (i == x - 1) {
          Edge e = new Edge(x1[i][j], x1[i][j + 1]);
          g1.AddEdge(e);
        } else if (j == z - 1) {
          Edge e1 = new Edge(x1[i][j], x1[i + 1][j]);
          g1.AddEdge(e1);
        } else {
          Edge e = new Edge(x1[i][j], x1[i][j + 1]);
          Edge e1 = new Edge(x1[i][j], x1[i + 1][j]);
          g1.AddEdge(e);
          g1.AddEdge(e1);
        }
      }
    }

    this.mst = new ArrayList<Edge>();
    g1.KruskalMST(this.mst);

  }

  @Override
  public void enterDungeon(Player p) throws IllegalArgumentException {
    this.playerInDungeon = p;
  }

  @Override
  public ArrayList<Edge> getDungeon() {
    return this.mst;
  }

  @Override
  public void generateRandomTreasure(int percent) throws IllegalArgumentException {
    // TODO Auto-generated method stub

  }

  @Override
  public ArrayList<String> getDirectionFrom(int cave) {
    ArrayList<String> directions = new ArrayList<String>();
    for (int i = 0; i < mst.size(); i++) {

      if (mst.get(i).node_start == cave) {
        if (mst.get(i).node_end == mst.get(i).node_start + 1) {
          directions.add("East");
        } else if (mst.get(i).node_end == cave + 8) {
          directions.add("South");
        }
      } else if (mst.get(i).node_end == cave) {
        if (mst.get(i).node_start == mst.get(i).node_end - 1) {
          directions.add("West");
        } else if (mst.get(i).node_start == cave - 8) {
          directions.add("North");
        }

      }

    }
    return directions;

  }
}
