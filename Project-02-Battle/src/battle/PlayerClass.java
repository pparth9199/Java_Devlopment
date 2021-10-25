package battle;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The class represents a player in the game and the corresponding options
 * available for the player.
 * 
 * @author parthpatel
 *
 */
public abstract class PlayerClass implements Player {
  @Override
  public String toString() {
    return String.format("Welcome to the game " + name + ",\nyour basic abilities are " + abilities
        + ",\nyour initial health is " + health + ", \nyour strength is " + strength
        + ",\nconstitution is " + constitution + ",\ndexterity is " + dexterity + ",\ncharisma is "
        + charisma + ",\ngear in your bag are " + gear
        + ",\nassigned Weapon that you have right now is Bare hands]");
  }

  private final String name;
  private final ArrayList<Integer> abilities;
  private int health;
  private int strength;
  private int constitution;
  private int dexterity;
  private int charisma;

  private int avoidanceAbility;
  private int tempAvoidance;
  private int potentialStrikingDamage;

  private ArrayList<ArrayList<String>> gear;

  private Weapons wp;
  private final String assignedWeapon;

  /**
   * This constructor initializes the player's name and also calculates the
   * abilities of the player.
   * 
   * @param name The name of the player entering the arena.
   */
  public PlayerClass(String name) {
    if (name == null) {
      throw new IllegalArgumentException();
    } else {
      this.name = name;
    }
    this.abilities = new ArrayList<Integer>();
    this.strength = getRandAbility();
    this.constitution = getRandAbility();
    this.charisma = getRandAbility();
    this.dexterity = getRandAbility();
    this.abilities.add(this.strength);
    this.abilities.add(this.dexterity);
    this.abilities.add(this.constitution);
    this.abilities.add(this.charisma);
    this.health = 0;
    for (int i = 0; i < abilities.size(); i++) {
      this.health += abilities.get(i);
    }
    this.gear = new ArrayList<ArrayList<String>>();
    Gear gw;
    gw = new GearClass();

    this.gear = gw.getBag();
    wp = new WeaponsClass();
    this.assignedWeapon = wp.getRandomWeapon();

  }

  /**
   * The method calculates each ability of the player.
   * 
   * @return the sum of top most 3 values generated from the dice
   */
  public int getRandAbility() {
    ArrayList<Integer> abil = new ArrayList<Integer>();
    for (int i = 0; i < 4; i++) {
      int temp = (int) (Math.random() * 5) + 2;
      abil.add(temp);
    }
    Collections.sort(abil);
    Collections.reverse(abil);
    int sum = 0;
    for (int i = 0; i < 3; i++) {
      sum += abil.get(i);
    }
    return sum;
  }

  @Override
  public int getHealth() {
    return this.health;
  }

  @Override
  public ArrayList<Integer> getAbilities() {
    this.abilities.set(0, this.strength);
    this.abilities.set(1, this.dexterity);
    this.abilities.set(2, this.constitution);
    this.abilities.set(3, this.charisma);
    this.health = 0;
    for (int i = 0; i < abilities.size(); i++) {
      this.health += abilities.get(i);
    }
    this.avoidanceAbility = this.dexterity + (int) (Math.random() * 6) + 1;
    this.tempAvoidance = this.avoidanceAbility;
    return this.abilities;

  }

  @Override
  public ArrayList<ArrayList<String>> assignBag() {
    return this.gear;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public void attack(Player p) {
    if (this.getStrikingPower() >= p.getUpdatedAvoidance()) {

      int damage = this.getPotentialStrikingDamage() - p.getConstitution();
      if (damage > 0) {
        p.doDamage(damage);
      }
    } else if (this.getStrikingPower() < p.getUpdatedAvoidance()) {
      p.setAvoidance();
    }

  }

  @Override
  public void setAvoidance() {

    this.tempAvoidance = this.tempAvoidance - 5;
  }

  @Override
  public void doDamage(int damage) {
    this.health = this.health - damage;

  }

  @Override
  public void selectHeadGear() {
    ArrayList<String> selected = gear.get(0);
    String selectedHg = selected.get(0);
    String power = HeadGear.valueOf(selectedHg).toString();
    if (power.charAt(0) == '+') {
      this.constitution += Character.getNumericValue(power.charAt(1));
    } else {
      this.constitution -= Character.getNumericValue(power.charAt(1));
    }

  }

  @Override
  public int getStrength() {
    return this.strength;
  }

  @Override
  public void beltSelect() {
    ArrayList<String> selected = gear.get(2);
    int units = 0;
    for (String b : selected) {
      if (b.contains("SMALL")) {
        units += 1;
      } else if (b.contains("MEDIUM")) {
        units += 2;
      } else if (b.contains("LARGE")) {
        units += 3;
      }
      if (units <= 10) {
        String power = Belts.valueOf(b).toString();
        if (power.charAt(0) == '+') {
          this.strength += Character.getNumericValue(power.charAt(1));
        } else if (power.charAt(0) == '-') {
          this.strength -= Character.getNumericValue(power.charAt(1));
        }
      }
    }

  }

  @Override
  public void potionSelect() {
    ArrayList<String> selected = gear.get(1);
    int temp = 0;
    for (String b : selected) {
      String power = Potions.valueOf(b).toString();
      if (power.charAt(0) == '+' && temp <= 3) {
        this.dexterity += Character.getNumericValue(power.charAt(1));
      } else if (power.charAt(0) == '-' && temp <= 3) {
        this.dexterity -= Character.getNumericValue(power.charAt(1));
      } else if (power.charAt(0) == '+' && temp > 3 && temp <= 6) {
        this.constitution += Character.getNumericValue(power.charAt(1));
      } else if (power.charAt(0) == '-' && temp > 3 && temp <= 6) {
        this.constitution -= Character.getNumericValue(power.charAt(1));
      } else if (power.charAt(0) == '+' && temp > 6 && temp <= 9) {
        this.charisma += Character.getNumericValue(power.charAt(1));
      } else if (power.charAt(0) == '-' && temp > 6 && temp <= 9) {
        this.charisma -= Character.getNumericValue(power.charAt(1));
      }
    }
  }

  @Override
  public void feetWearSelect() {
    ArrayList<String> selected = gear.get(3);
    String selectedHg = selected.get(0);
    String power = FootWear.valueOf(selectedHg).toString();
    if (power.charAt(0) == '+') {
      this.dexterity += Character.getNumericValue(power.charAt(1));
    } else {
      this.dexterity -= Character.getNumericValue(power.charAt(1));
    }
  }

  public String getAssignedWeapon() {
    return this.assignedWeapon;

  }

  public int getPotentialStriking() {
    return this.potentialStrikingDamage;
  }

  /**
   * The method gets the Striking power of the current player.
   * 
   * @return integer value of strikingPower.
   */
  public int getStrikingPower() {
    int strikingPower;
    strikingPower = this.strength + (int) (Math.random() * 10) + 1;
    return strikingPower;
  }

  public int getAvoidanceAbility() {

    return this.avoidanceAbility;
  }

  @Override
  public int getUpdatedAvoidance() {
    return this.tempAvoidance;
  }

  /**
   * The method gets the potentialStrikingDamage for the player.
   * 
   * @return integer value for potential striking damage
   */
  public int getPotentialStrikingDamage() {
    if (this.strength > 14) {
      this.potentialStrikingDamage = this.strength + wp.getWeaponDamage(this.assignedWeapon, true);
    } else {
      this.potentialStrikingDamage = this.strength + wp.getWeaponDamage(this.assignedWeapon, false);
    }
    return this.potentialStrikingDamage;
  }

  @Override
  public int getConstitution() {
    return this.constitution;
  }

  public int getCharisma() {
    return this.charisma;
  }

  @Override
  public int actualDamage(Player opo) {
    int actualDamage;
    actualDamage = this.potentialStrikingDamage - opo.getConstitution();
    return actualDamage;
  }
}
