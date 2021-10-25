package sanctuary;

import java.util.ArrayList;

/**
 * The enclosure class defines the enclosure designa and lets add troops to
 * enclosrures.
 */
public class Enclosure {
  private Cells cell;
  private ArrayList<Monkey> encm;

  /**
   * The constructor initializes the values for total cells in the enclosure.
   */
  public Enclosure(int cells) {
    encm = new ArrayList<Monkey>();
    if (cells > 0) {
      cell = new Cells(cells);
    } else {
      throw new IllegalArgumentException();
    }
  }

  /**
   * The add to enclosure method adds the monkey to a list and checks if there are
   * empty cells. If not throws an exception.
   */
  public void addToEnclosure(Monkey m) {
    if (cell.getCell()) {
      encm.add(m);
    } else {
      throw new IllegalStateException("Enclosure full!");
    }
  }

  public ArrayList<Monkey> getCount() {
    return this.encm;
  }

}
