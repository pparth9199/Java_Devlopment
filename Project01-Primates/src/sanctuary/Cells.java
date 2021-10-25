package sanctuary;

/**
 * Class cells which is used to check for empty cells and for checking if the
 * troops are already in there.
 */
public class Cells {

  private int totalCells;

  private int availableCell;

  /**
   * The constructor used to intialize cells which gives number of cells.
   */
  public Cells(int totalCells) {
    if (totalCells < 0) {
      throw new IllegalArgumentException();
    } else {
      this.totalCells = totalCells;
      this.availableCell = totalCells;
    }
  }

  /**
   * Gives true or false value if the cells are available by comparing the total
   * cells and available cells.
   */
  public boolean getCell() {
    if (this.totalCells - this.availableCell >= 0) {
      this.availableCell = this.availableCell - 1;
      return true;

    } else {
      return false;
    }

  }
}
