package battle;

import java.util.ArrayList;

/**
 * The arena class lets the players to enter the arena and decide whose turn it
 * is to play the game.
 * 
 * @author parthpatel
 *
 */
public class Arena {
  private final ArrayList<Player> arenaPlayers;

  /**
   * The arena constructor intantiates the player arrayList of the type player
   * object.
   */
  public Arena() {
    this.arenaPlayers = new ArrayList<Player>();
  }

  /**
   * The enter arena method enters the players in the arena into an ArrayList of
   * Players.
   * 
   * @param p the player object
   */
  public void enterArena(Player p) {
    if (this.arenaPlayers.size() == 2) {
      throw new IllegalArgumentException();
    } else {
      this.arenaPlayers.add(p);
    }
  }

  public ArrayList<Player> getPlayersInArena() {
    return this.arenaPlayers;
  }

  /**
   * The method decisdes whose turn will be first.
   * 
   * @return the boolean true for player 1 and false for player 2
   */
  public boolean getTurn() {
    return arenaPlayers.get(0).getCharisma() >= arenaPlayers.get(1).getCharisma();
  }

}
