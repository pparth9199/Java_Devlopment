package battle;

/**
 * Enum with a list of all the head gear available to select and assemble in a
 * bag.
 * 
 * @author parthpatel
 *
 */
public enum HeadGear {
  COTTONHAT("+2"), HARDHAT("+3"), PLASTICHAT("-4"), WOODHAT("-1"), METALHAT("+5"), DIAMONDHAT("+7");

  private final String power;

  private HeadGear(String power) {
    this.power = power;
  }

  /**
   * The method convert the names of the HeadGear into a string array for easier
   * calculation.
   * 
   * @return array of string type of potions
   */
  public static String[] getHead() {
    String[] headG = new String[values().length];
    int index = 0;

    for (HeadGear hg : values()) {
      headG[index++] = hg.name();
    }

    return headG;
  }

  @Override
  public String toString() {
    return this.power;
  }

  public String getValue() {
    return this.power;
  }
}