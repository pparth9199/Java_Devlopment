package battletest;

import static org.junit.Assert.assertEquals;

import battle.Arena;
import battle.Player;
import battle.PlayerClass;
import org.junit.Before;
import org.junit.Test;

/**
 * The arena test clas tests for the player entering the battlefield and not to
 * add two or more players.
 * 
 * @author parthpatel
 *
 */
public class ArenaTest {
  Arena a1;

  /**
   * The setup method creates an object of arena class in order to perform the
   * testing.
   */
  @Before
  public void setUp() {
    a1 = new Arena();
  }

  /**
   * The enterArena tests for two players entering in the arena.
   */
  @Test
  public void enterArenaTest() {
    Player p1 = new PlayerClass("Parth") {
    };
    a1.enterArena(p1);
    Player p2 = new PlayerClass("Riddhi") {
    };
    a1.enterArena(p2);
    assertEquals(2, a1.getPlayersInArena().size());
  }

  /**
   * The test is attemting to add more than 2 player in arena and failing to do
   * so.
   */
  @Test(expected = IllegalArgumentException.class)
  public void enterArenaFailTest() {
    Player p1 = new PlayerClass("Parth") {
    };
    a1.enterArena(p1);
    Player p2 = new PlayerClass("Riddhi") {
    };
    a1.enterArena(p2);
    Player p3 = new PlayerClass("Raj") {
    };
    a1.enterArena(p3);
  }
}
