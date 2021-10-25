package sanctuary;

import java.util.ArrayList;

/**
 * The sanctuary class extends the sanctuary interface.
 */
public class SanctuaryClass implements Sanctuary {
  private ArrayList<Monkey> m;

  /**
   * The constructor intializes the monkey arrayList.
   */
  public SanctuaryClass() {
    m = new ArrayList<Monkey>();
  }

  /**
   * The add monkey adds a monkey to the arraylist of monkey.
   */
  public void addMonkey(Monkey m) {
    this.m.add(m);
  }

  public ArrayList<Monkey> getList() {
    return this.m;
  }

}
