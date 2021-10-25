package sanctuary;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * This test class tests the Monkey class.
 */
public class MonkeyTest {
  private Monkey m1;

  /**
   * This method assigns object to the monkey class.
   */
  @Before
  public void setUp() {
    m1 = new Monkey(2, "Cotton-Top Tamarin", "Sagnius oedipus", "Male", 1, 22, "apple", 2, true,
        false);
  }

  /**
   * This method tests the toString method of the monkey class.
   */
  @Test
  public void testToString() {
    assertEquals(
        "Monkey id: 2 Name:Cotton-Top Tamarin Troop: Sagnius oedipus Sex: Male Weight: 1 Size: "
            + "22 food: apple age: 2 Healthy:true inIsolation: false",
        m1.toString());

  }

  /**
   * This method tests the enclosure details.
   */
  @Test
  public void testEnclosureDetails() {
    assertEquals("The Monkey's name is Cotton-Top Tamarin and is of the sex Male. "
        + "The monkey likes to eat apple.", m1.getEncloDetails());
  }
}
