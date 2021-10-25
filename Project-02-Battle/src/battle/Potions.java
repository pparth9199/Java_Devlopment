package battle;

/**
 * The enum of potion contains all the postions that are available to be
 * assembled in a bag and assign to the player.
 * 
 * @author parthpatel
 *
 */
public enum Potions {
  ENERGYWATER("+2"), ENERGYCOLA("+1"), POWERADE("+2"), POWEUP("-2"), GATORADE("+1"),
  BLACKBULL("+2"), REDBULLYELLOW("-1"), REDBULL("-4"), GATORADEBLACK("+1"), GATORADEYELLOW("+2"),
  GATORADEPEACH("+1"), GATORADERED("+3"), GATORADEPINK("+1"), GATORADEGREEN("+3"),
  GATORADEBLUE("+2");

  private final String power;

  private Potions(String power) {

    this.power = power;

  }

  /**
   * The method convert the names of the potions into a string array for easier
   * calculation.
   * 
   * @return array of string type of potions
   */
  public static String[] getPotions() {
    String[] headG = new String[values().length];
    int index = 0;

    for (Potions pt : values()) {
      headG[index++] = pt.name();
    }

    return headG;
  }

  @Override
  public String toString() {
    return this.power;
  }

}
