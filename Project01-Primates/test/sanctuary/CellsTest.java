package sanctuary;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * CellsTest is the class for testing the corresponding cells class.
 */
public class CellsTest {
  private Cells cell;

  /**
   * Setup method.
   */
  @Before
  public void setup() {
    cell = new Cells(4);

  }

  /**
   * The test method for costructor of the cells class.
   */
  @Test(expected = IllegalArgumentException.class)
  public void constTest() {
    new Cells(-1);
  }

  /**
   * The test method for the getCells method.
   */
  @Test
  public void getCellsTest() {
    cell.getCell();
    cell.getCell();
    cell.getCell();
    cell.getCell();
    cell.getCell();
    assertEquals(true, cell.getCell());
  }

}
