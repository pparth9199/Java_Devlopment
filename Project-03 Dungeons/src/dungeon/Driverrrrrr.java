package dungeon;

import java.util.ArrayList;

public class Driverrrrrr {

  public static void main(String[] args) {
    Dungeon d = new DungeonClass();
    Player p = new PlayerClass("Parth");

    d.enterDungeon(p);

    ArrayList<Edge> edgarr = d.getDungeon();
    for (int i = 0; i < edgarr.size(); i++) {

      System.out.print(edgarr.get(i).node_start+", end ");
      System.out.println(edgarr.get(i).node_end);
    }
    
    ArrayList<String> arr = d.getDirectionFrom(4);
    for (int i = 0; i < arr.size(); i++) {

      System.out.print(arr.get(i));

    }
  }

}
