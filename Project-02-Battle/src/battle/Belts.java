package battle;

/**
 * The enum of Belts contains all the Belts that are available to be assembled
 * in a bag and assign to the player.
 * 
 * @author parthpatel
 *
 */
public enum Belts {
  IRONMEDIUM("+2"), GYPSUMSMALL("+4"), TITANIUMSMALL("+3"), GLASSMEDIUM("-2"), IRONLARGE("+5"),
  GYPSUMLARGE("+8"), GLASSSMALL("-1"), GLASSLARGE("-4"), IRONSMALL("+1"), TUNGSTENMEDIUM("+6"),
  TUNGSTENLARGE("+9"), TUNGSTENSMALL("+3"), TITANIUMLARGE("+7"), TITANIUMMEDIUM("+6"),
  BRONZELARGE("+5");

  private final String power;

  private Belts(String power) {

    this.power = power;

  }

  /**
   * The method convert the names of the belts into a string array for easier
   * calculation.
   * 
   * @return array of string type of potions
   */
  public static String[] getBelts() {
    String[] headG = new String[values().length];
    int index = 0;

    for (Belts bt : values()) {
      headG[index++] = bt.name();
    }

    return headG;
  }

  @Override
  public String toString() {
    return this.power;
  }
}
