package sanctuary;

import org.junit.Test;

/**
 *This class tests enclosure class.
 */
public class EnclosureTest {
  
  /**
   * The method tests for there not to be negative values.
   */
  @Test(expected = IllegalArgumentException.class)
  public void consttest() {
    Enclosure enc = new Enclosure(-10);
  }

}
