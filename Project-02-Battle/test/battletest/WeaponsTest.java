package battletest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import battle.Weapons;
import battle.WeaponsClass;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * The weaponTest class is created to check assumptions to assign the weapon to
 * a player are correct.
 * 
 * @author parthpatel
 *
 */
public class WeaponsTest {
  Weapons w1;

  /**
   * The set up method creates a weapon class object which intializes all the
   * weapons.
   */
  @Before
  public void setUp() {
    w1 = new WeaponsClass();
  }

  /**
   * Testing if total 5 weapons are assigned to the weapon list.
   */
  @Test
  public void testFiveWeapons() {
    assertEquals(5, w1.getAvailableWeapons().size());
  }

  /**
   * Testing if the random weapon allocated is in the list of the available
   * weapons.
   */
  @Test
  public void testRandomWeapon() {
    ArrayList<String> arr = w1.getAvailableWeapons();
    assertTrue(arr.contains(w1.getRandomWeapon()));
  }

  /**
   * Testing is the weapon random damage is in the range of the requirements.s
   */
  @Test
  public void getWeaponDamageTest() {
    int x = w1.getWeaponDamage("Flails", false);
    assertTrue(x >= 4 && x <= 6);
  }

}
