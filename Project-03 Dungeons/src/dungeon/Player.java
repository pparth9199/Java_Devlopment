package dungeon;

public interface Player {
  /**
   * The move method enables player to move from one cave to any available cave
   * direction.
   * 
   * @param direction one direction from the available directions
   */
  void move(String direction);

  /**
   * The method is used to pick up treasure by a player at his current location.
   * 
   * @param cave the cave number where the player is.
   */
  void pickUpTreasure(int[][] cave);

  /**
   * This method indicates the playerlocation with a cave number.
   * 
   * @return The cave in form of int[][] of cave location.
   */
  int[][] playerLocation();

}
