package battletest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import battle.Player;
import battle.PlayerClass;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * The playerClassTest tests various aspects of the random number generation
 * along wiht the attacking damage change.
 * 
 * @author parthpatel
 *
 */
public class PlayerClassTest {
  private Player p1;

  /**
   * This method initialize the constructor to setup the test class.
   */
  @Before
  public void setUp() {
    p1 = new PlayerClass("Parth") {
    };
  }

  /**
   * Testing constructor to assign the name of the player.
   */
  @Test
  public void testConst() {
    assertEquals("Parth", p1.getName());
  }

  /**
   * Testing the constructor to raise issues on null name.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testIncost() {
    new PlayerClass(null) {
    };
  }

  /**
   * Testing the random ability generator of dice within the ranges of the
   * presumed values.
   */
  @Test
  public void getRandAbilityTest() {
    assertTrue(p1.getRandAbility() <= 18 && p1.getRandAbility() >= 6);
  }

  /**
   * Testing getHealth method to see if the health is in range after assignments
   * of the random values.
   */
  @Test
  public void getHealthTest() {
    assertTrue(p1.getHealth() >= 24 && p1.getHealth() <= 72);
  }

  /**
   * Testing ability recieved in order to be in the range from 6 to 18.
   */
  @Test
  public void getAbilitiesTest() {
    ArrayList<Integer> arr = p1.getAbilities();
    assertTrue(arr.get(0) >= 6 && arr.get(0) <= 18);
    assertTrue(arr.get(1) >= 6 && arr.get(1) <= 18);
    assertTrue(arr.get(2) >= 6 && arr.get(2) <= 18);
    assertTrue(arr.get(3) >= 6 && arr.get(3) <= 18);
  }

  /**
   * Testing attack method to see if the health is decreased after a certain
   * attack.
   */
  @Test
  public void attackTest() {
    int healthOld = p1.getHealth();
    Player p2 = new PlayerClass("Riddhi") {
    };
    p2.attack(p1);
    int healthNew = p1.getHealth();
    assertTrue(healthOld > healthNew);
  }

  /**
   * Testing the head gear assignment affecting the constitution or not.
   */
  @Test
  public void selectHeadGearTest() {
    int oldConstitution = p1.getConstitution();
    p1.selectHeadGear();
    int newConstituion = p1.getConstitution();
    assertTrue(oldConstitution != newConstituion);

  }

  /**
   * Testing the belt assignment to affect the strength of the player.s
   */
  @Test
  public void selectBeltTest() {
    int oldStrength = p1.getStrength();
    p1.beltSelect();
    int newStrength = p1.getStrength();
    assertTrue(oldStrength != newStrength);
  }

  /**
   * Testing the postion selection method inorder to see if the charisma of a
   * player is affected or not.
   */
  @Test
  public void potionSelectTest() {
    int oldCharisma = p1.getCharisma();
    p1.potionSelect();
    int newCharisma = p1.getCharisma();
    assertTrue(oldCharisma != newCharisma);
  }
}
