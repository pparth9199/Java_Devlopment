package battletest;

import static org.junit.Assert.assertEquals;

import battle.Gear;
import battle.GearClass;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * The GearClassTest is created inorder to test the gear class which creates a
 * bag of gear objects.
 * 
 * @author parthpatel
 *
 */
public class GearClassTest {
  Gear g1;

  /**
   * Creating an object of the gear class in order to test the add bag
   * functionalites of the class.
   */
  @Before
  public void setUp() {
    g1 = new GearClass();
  }

  /**
   * Testing if 20 items are added in the bag on construction of the gear object.
   */
  @Test
  public void testConst() {
    ArrayList<ArrayList<String>> arr = g1.getBag();
    int i = arr.get(0).size() + arr.get(1).size() + arr.get(2).size() + arr.get(3).size();
    assertEquals(20, i);
  }

}
