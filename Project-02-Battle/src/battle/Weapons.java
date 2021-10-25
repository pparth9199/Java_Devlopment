package battle;

import java.util.ArrayList;

/**
 * The weapons are assigned in order to let the user use them during the
 * battle.s
 * 
 * @author parthpatel
 *
 */
public interface Weapons {
  /**
   * The method gives a list of all the available weapons that are available.
   * 
   * @return an ArrayList of strings wiht the weapons in the inventory.s
   */
  ArrayList<String> getAvailableWeapons();

  /**
   * This method gives the damage of the weapon that a player is using. It also
   * checks for the strength of the player to determine the striking power.
   * 
   * @param swordName The weapon name which is selected.
   * @param strength  The boolean value if the strength of the player is matching
   *                  for the max potential of the weapon
   * @return an integer value of a random hit and the damage by that hit of the
   *         weapon
   */
  int getWeaponDamage(String swordName, boolean strength);

  /**
   * This method gives a random weapon from the inventory of arrayList of weapons.s
   * 
   * @return name of the weapon randomly assigned
   */
  String getRandomWeapon();

}
