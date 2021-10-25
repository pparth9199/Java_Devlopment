package sanctuary;

import java.util.ArrayList;

/**
 * A sacntuary interface contains methods to add monkey and get the lsit of all
 * the monkey objects.
 */
public interface Sanctuary {
  
  /**
   * The add monkey method adds monkey to the array list of objects of monkey.
   */
  public void addMonkey(Monkey m);
  
  /**
   * The getlist method returns a list of all the monkey objects.
   */

  public ArrayList<Monkey> getList();
}
