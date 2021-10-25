package battle;

import java.util.ArrayList;

/**
 * The weapon class implements the weapon interface and creates an instance of
 * weapon for assignment to the players.
 * 
 * @author parthpatel
 *
 */
public class WeaponsClass implements Weapons {
  private final ArrayList<String> weapons;

  /**
   * The constructor initializes an arrayList of weapons with fixed values more
   * can be added by adding weapon names in the constructors.
   */
  public WeaponsClass() {
    this.weapons = new ArrayList<String>();
    weapons.add("Katan");
    weapons.add("BroadSwords");
    weapons.add("Two handed swords");
    weapons.add("Axes");
    weapons.add("Flails");
  }

  @Override
  public ArrayList<String> getAvailableWeapons() {
    return this.weapons;
  }

  @Override
  public String getRandomWeapon() {
    int index = (int) (Math.random() * weapons.size());
    String weapon = weapons.get(index);
    return weapon;
  }

  @Override
  public int getWeaponDamage(String weaponName, boolean suffStrength) {
    int damage = 0;
    if (weaponName.equals("Katan")) {
      damage = (int) (Math.random() * 3) + 4;
    } else if (weaponName.equals("BroadSwords")) {
      damage = (int) (Math.random() * 5) + 6;
    } else if (weaponName.equals("Two handed swords") && suffStrength) {
      damage = (int) (Math.random() * 5) + 8;
    } else if (weaponName.equals("Two handed swords")) {
      damage = (int) (Math.random() * 3) + 4;
    } else if (weaponName.equals("Axes")) {
      damage = (int) (Math.random() * 5) + 6;
    } else if (weaponName.equals("Flails") && suffStrength) {
      damage = (int) (Math.random() * 5) + 8;
    } else if (weaponName.equals("Flails")) {
      damage = (int) (Math.random() * 3) + 4;
    }
    return damage;
  }

}
