package battle;

import java.util.ArrayList;

/**
 * The player calculates the health and assigns abilities related to the player
 * accordingly.
 * 
 * @author parthpatel
 *
 */
public interface Player {
  /**
   * The method handles the health calculation when a player is attacking.
   */
  void attack(Player p);

  /**
   * The method makes necessary changes to health of the player during an attack.
   */

  void doDamage(int damage);

  /**
   * The method lets the player select a head gear.
   */

  void selectHeadGear();

  /**
   * The method lets the player select a belt.
   */

  void beltSelect();

  /**
   * The method lets to pick a feet wear for the player.
   * 
   */

  void feetWearSelect();

  /**
   * The method returns the basic abilities of the player.
   * 
   * @return an arrayList of abilities.
   */
  ArrayList<Integer> getAbilities();

  /**
   * This method lets the player select potions.
   */
  void potionSelect();

  /**
   * This method gives the health of the current player.
   * 
   * @return the health of player.
   */

  ArrayList<ArrayList<String>> assignBag();

  /**
   * The method gets the constitution of the player.
   * 
   * @return integer value of constitution
   */

  int getConstitution();

  /**
   * This counts the actual damage of the player when struck.
   * 
   * @param opo is the player object whose damge has to be calculated.
   * @return the actualDamage of the players
   */
  int actualDamage(Player opo);

  /**
   * Thi method updates avoidance when it turns out to be same as the striking
   * power or higher than that.
   * 
   * @return the updated avoidance ability.
   */
  int getUpdatedAvoidance();

  /**
   * The set avoidance makes a decrease in the avoidance ability after every
   * strike from a player.
   */
  void setAvoidance();

  /**
   * The method returns the gharisma of a player inorder to determint the turn.
   * 
   * @return integer value of charismas
   */
  int getCharisma();

  /**
   * The constructed method is returned to see if the name is correct and so it
   * can be used further.
   * 
   * @return name of the player
   */
  String getName();

  /**
   * This method gives information about the player's health.
   * 
   * @return player's health.s
   */
  int getHealth();

  /**
   * The method returns the randomly assigned weapon to the players.
   * 
   * @return string of the weapon givens
   */

  String getAssignedWeapon();

  /**
   * This method gives out the striking power of the player that is calculated.s
   * 
   * @return integer value of striking power
   */
  int getStrikingPower();

  /**
   * generates a random sum with the dice logic and returns per ability.
   * 
   * @return value of sum of top 3 highest rolls.
   */
  int getRandAbility();

  /**
   * The creation of the method is done for testign purposes of strength.
   * 
   * @return value of strength.
   */
  int getStrength();

}
