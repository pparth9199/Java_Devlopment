package dungeon;

import java.util.ArrayList;

public interface Dungeon {
  /**
   * The enter dungeon method lets the players enter the dungeon at the start of
   * the game.
   * 
   * @param p the object of player that has entered the dungeon.
   */
  void enterDungeon(Player p) throws IllegalArgumentException;

  /**
   * The game should generate random 20% of treasure and put it in the caves which
   * is responsibility of this method.
   * 
   * @param percent the percentage of treasure to be assigned to the caves if
   *                specified.
   */

  void generateRandomTreasure(int percent) throws IllegalArgumentException;

  /**
   * The methods tells the directions that are available from the cave.
   * 
   * @param cave a 2x2 index of location of the cave
   * @return returns an arraylist of string of available directions
   */
  ArrayList<String> getDirectionFrom(int cave);

  ArrayList<Edge> getDungeon();
}