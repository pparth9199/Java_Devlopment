package battle;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The gear class is an implementation of the gear interface the class is
 * responsible to assemble a bag of gear and give it to the players when
 * requested.
 * 
 * @author parthpatel
 *
 */
public class GearClass implements Gear {
  private final ArrayList<ArrayList<String>> bag;

  /**
   * The gearClass constructor assembles all the values of gears from their
   * respective enums and adds them to a bag.
   */
  public GearClass() {
    String[] headGears;
    String[] potions;
    String[] belts;

    headGears = HeadGear.getHead();
    potions = Potions.getPotions();
    belts = Belts.getBelts();
    String[] footWear;
    footWear = FootWear.getFootWear();
    this.bag = new ArrayList<ArrayList<String>>();
    this.bag.add(sort(headGears, 1));
    this.bag.add(sort(potions, 9));
    this.bag.add(sort(belts, 9));
    this.bag.add(sort(footWear, 1));
  }

  @Override
  public ArrayList<ArrayList<String>> getBag() {
    return this.bag;
  }

  @Override
  public ArrayList<String> sort(String[] arr, int n) {

    ArrayList<String> list = new ArrayList<String>(arr.length);
    for (int i = 0; i < arr.length; i++) {
      list.add(arr[i]);
    }
    Collections.shuffle(list);
    String[] hg = new String[n];
    for (int i = 0; i < n; i++) {
      hg[i] = list.get(i);
    }
    ArrayList<String> gearNames = new ArrayList<String>();
    for (String h : hg) {
      gearNames.add(h);
    }
    Collections.sort(gearNames, String.CASE_INSENSITIVE_ORDER);
    return gearNames;
  }

}
