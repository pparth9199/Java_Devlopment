package battle;

import java.util.ArrayList;

/**
 * The interface for gear assembles a bag of gears and assigns it to the player.
 * 
 * @author parthpatel
 *
 */
public interface Gear {
  /**
   * The sort method sorts the array of individual gear from head to bottom and
   * also alphabetically.
   * 
   * @param arr the gear array
   * @param n   the number of gears to be selected
   * @return sorted arraylist of the gear
   */
  ArrayList<String> sort(String[] arr, int n);

  /**
   * The getBag method creates a bag of gear and returns them to the players
   * requesting it.
   * 
   * @return bag of gears
   */
  ArrayList<ArrayList<String>> getBag();

}
