package battle;

/**
 * The enum of FootWear contains all the foot wear gear that are available to be
 * assembled in a bag and assign to the player.
 * 
 * @author parthpatel
 *
 */
public enum FootWear {
  SLIPPERS("+2"), SNEAKERS("+3"), SPORTSHOES("-4"), STILLETOES("-1"), SANDALS("+5"), SOCKS("-3");

  private final String power;

  private FootWear(String power) {

    this.power = power;

  }

  /**
   * The method convert the names of the foot wear gear into a string array for
   * easier calculation.
   * 
   * @return array of string type of footwear
   */
  public static String[] getFootWear() {
    String[] headG = new String[values().length];
    int index = 0;

    for (FootWear bt : values()) {
      headG[index++] = bt.name();
    }

    return headG;
  }

  @Override
  public String toString() {
    return this.power;
  }

}
