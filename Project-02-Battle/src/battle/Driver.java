package battle;

import java.util.Scanner;

/**
 * The driver class displays the output of the game and lets the user reset the
 * game.
 * 
 * @author parthpatel
 *
 */
public class Driver {

  /**
   * The main method to run our program and generate an output.
   */
  public static void main(String[] args) {
    boolean run = true;
    while (run) {

      Player p1;
      Player p2;
      Arena a1;
      p1 = new PlayerClass("Parth") {

      };
      p2 = new PlayerClass("Riddhi") {
      };
      a1 = new Arena();
      System.out.println(p1.toString());
      System.out.println("----------------------------------------------------------");
      System.out.println(p2.toString());
      System.out.println("----------------------------------------------------------");

      a1.enterArena(p1);
      a1.enterArena(p2);

      System.out.println(
          "The players entered in the arena are : " + a1.getPlayersInArena().get(0).getName() + ", "
              + a1.getPlayersInArena().get(1).getName());
      System.out.println("----------------------------------------------------------");
      System.out.println("Gear Selection in progress...");
      p1.selectHeadGear();
      p1.beltSelect();
      p1.potionSelect();
      p1.feetWearSelect();
      p1.getAssignedWeapon();
      System.out.println(
          "The abilities of " + p1.getName() + " after gear selection and weapon selection are: ");
      System.out.println("Strength :" + p1.getAbilities().get(0));
      System.out.println("Constitution :" + p1.getAbilities().get(1));
      System.out.println("Dexterity :" + p1.getAbilities().get(2));
      System.out.println("Charisma :" + p1.getAbilities().get(3));
      System.out.println("The advanced abilities of " + p1.getName() + " are :");
      System.out.println("Striking power : " + p1.getStrikingPower());
      System.out.println("Avoidance Ability : " + p1.getUpdatedAvoidance());
      System.out
          .println("Potential Striking Damage : " + ((PlayerClass) p1).getPotentialStriking());
      p2.selectHeadGear();
      p2.beltSelect();
      p2.potionSelect();
      p2.feetWearSelect();
      System.out.println();
      System.out.println(
          "The abilities of " + p2.getName() + " after gear selection and weapon selection are: ");
      System.out.println("Strength :" + p2.getAbilities().get(0));
      System.out.println("Constitution :" + p2.getAbilities().get(1));
      System.out.println("Dexterity :" + p2.getAbilities().get(2));
      System.out.println("Charisma :" + p2.getAbilities().get(3));
      System.out.println("The advanced abilities of " + p2.getName() + " are :");
      System.out.println("Striking power : " + p2.getStrikingPower());
      System.out.println("Avoidance Ability : " + p2.getUpdatedAvoidance());
      System.out
          .println("Potential Striking Damage : " + ((PlayerClass) p2).getPotentialStriking());
      System.out.println("----------------------------------------------------------");
      int turn = 0;
      if (a1.getTurn()) {
        turn = 1;
        System.out.println("With higher charisma " + p1.getName() + " will take the first turn.");
      } else {
        turn = 2;
        System.out.println("With higher charisma " + p2.getName() + " will take the first turn.");
      }
      int j = 0;
      int x = 0;
      int flag = 0;
      while (j == 0) {
        x++;
        if (p2.getHealth() <= 0) {
          flag = 1;
          break;
        } else if (p1.getHealth() <= 0) {
          flag = 2;
          break;
        } else if (turn == 1) {
          System.out.println("Stats for Round : " + x);
          System.out.println("Health of : " + p1.getName() + " is " + p1.getHealth());
          System.out.println("Health of : " + p2.getName() + " is " + p2.getHealth());
          System.out.println();
          p1.attack(p2);
          p2.attack(p1);
        } else if (turn == 2) {
          System.out.println("Stats for Round : " + x);
          System.out.println("Health of : " + p1.getName() + " is " + p1.getHealth());
          System.out.println("Health of : " + p2.getName() + " is " + p2.getHealth());
          System.out.println();
          p2.attack(p1);
          p1.attack(p2);

        }
      }
      if (flag == 1) {
        System.out.println(p1.getName() + " wins the game!!! Congratulations " + p1.getName());
      } else {
        System.out.println(p2.getName() + " wins the game!!! Congratulations " + p2.getName());
      }
      System.out.println("Enter y to start again and n to quit: ");
      Scanner myObj = new Scanner(System.in);
      char status = myObj.next().charAt(0);
      if (status == 'y' || status == 'Y') {
        run = true;
      } else {
        break;
      }
      myObj.close();

    }
  }

}
