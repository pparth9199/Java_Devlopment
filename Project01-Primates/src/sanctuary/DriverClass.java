package sanctuary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/**
 * Main driver class to execute the designed classes and use for debugging.
 */
public class DriverClass {

  /**
   * Main method to execute methods and create new objects.
   */
  public static void main(String[] args) {
    Monkey m = new Monkey(1, "Pale-headed Saki", "Pithecia", "Male", 1, 20, "eggs", 2, true, false);
    Monkey m1 = new Monkey(2, "Cotton-Top Tamarin", "Sagnius oedipus", "Male", 1, 22, "apple", 2,
        true, false);
    Monkey m2 = new Monkey(3, "Black and gold howler", "Alouatta Caraya", "Male", 1, 17, "Leaves",
        2, true, false);
    Monkey m3 = new Monkey(4, "Guereza", "Colobus guereza", "Male", 1, 15, "nuts", 2, true, false);
    Monkey m4 = new Monkey(5, "Pale-headed Saki", "Pithecia", "Male", 1, 40, "Sap", 2, true, false);
    SanctuaryClass s = new SanctuaryClass();
    s.addMonkey(m);
    s.addMonkey(m4);
    s.addMonkey(m3);
    s.addMonkey(m2);
    s.addMonkey(m1);

    Enclosure e = new Enclosure(6);

    e.addToEnclosure(m4);
    e.addToEnclosure(m3);
    e.addToEnclosure(m2);
    e.addToEnclosure(m1);
    e.addToEnclosure(m);

    System.out.println("The complete list of animals in Sanctuary is :");
    ArrayList<Monkey> returnArray = s.getList();
    for (int i = 0; i < returnArray.size(); i++) {
      System.out.println(returnArray.get(i).toString());
    }
    System.out.println();
    System.out.println("The Species that are present in Sanctuary Sorted Alphabeticaly are: ");
    String[] species = new String[returnArray.size()];
    for (int i = 0; i < returnArray.size(); i++) {
      species[i] = returnArray.get(i).getSpecies();
    }
    Arrays.sort(species);
    System.out.println(Arrays.toString(species));

    System.out.println();
    System.out.println("The species present in enclosure are:");
    ArrayList<Monkey> arr = e.getCount();
    String[] speci = new String[arr.size()];

    for (int i = 0; i < arr.size(); i++) {
      speci[i] = arr.get(i).getSpecies();
    }

    int end = speci.length;
    Set<String> set = new HashSet<String>();

    for (int i = 0; i < end; i++) {
      set.add(speci[i]);
    }
    java.util.Iterator<String> it = set.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
    System.out.println();
    System.out.println("The enclosure board details are: ");
    for (int i = 0; i < arr.size(); i++) {
      System.out.println(arr.get(i).getEncloDetails());
    }

  }

}
