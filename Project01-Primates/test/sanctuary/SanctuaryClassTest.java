package sanctuary;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 *This class tests the sanctuary class.
 */
public class SanctuaryClassTest {

  private SanctuaryClass sanc;
  private Monkey mon;

  /**
   * The setup method initializes the object for sanctuary class.
   */
  @Before
  public void setup() {
    sanc = new SanctuaryClass();
    mon = new Monkey(1, "Pale-headed Saki", "Pithecia", "Male", 1, 20, "eggs", 2, true, false);
  }

  /**
   * The getList method tests the required list.
   */
  @Test
  public void getListTest() {
    sanc.addMonkey(mon);
    ArrayList<Monkey> arr = sanc.getList();

    assertEquals("Pithecia", arr.get(0).getSpecies());
  }

}
