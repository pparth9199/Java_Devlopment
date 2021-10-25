package sanctuary;

/**
 * Monkey class.
 *
 */
public class Monkey {
  private String name;
  private String troop;
  private String sex;
  private int weight;
  private int size;
  private String food;
  private int age;
  private boolean isHealthy;
  private boolean inIsolation;
  private int monkeyId;

  /**
   * Constructor to initialize values.
   */
  public Monkey(int monkeyId, String name, String troop, String sex, int weight, int size,
      String food, int age, boolean isHealthy, boolean inIsolation) {
    this.monkeyId = monkeyId;
    this.name = name;
    this.troop = troop;
    this.sex = sex;
    this.weight = weight;
    this.size = size;
    this.food = food;
    this.age = age;
    this.isHealthy = isHealthy;
    this.inIsolation = inIsolation;
  }

  /**
   * Transfers monkey and returns values of monkey to transfer it.
   */
  public String toString() {
    String s = String.format("Monkey id: " + this.monkeyId + " Name:" + this.name + " Troop: "
        + this.troop + " Sex: " + this.sex + " Weight: " + this.weight + " Size: " + this.size
        + " food: " + this.food + " age: " + this.age + " Healthy:" + this.isHealthy
        + " inIsolation: " + this.inIsolation);
    return s;

  }

  public int getSize() {
    return this.size;
  }

  public String getSpecies() {
    return this.troop;
  }

  /**
   * This method gives the sign board for the monkey stating its name, sex and fav
   * food.
   */
  public String getEncloDetails() {
    String s = String.format("The Monkey's name is " + this.name + " and is of the sex " + this.sex
        + ". The monkey likes to eat " + this.food + ".");
    return s;
  }
}
