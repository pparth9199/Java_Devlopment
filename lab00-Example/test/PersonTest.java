import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import person.Person;


/**
 * A JUnit test class for the Person class.
 */
public class PersonTest {

  private Person john;
  
  /**
   * Test setup method.
   */
  @Before
    public void setUp() {
    john = new Person("John", "Doe", 1945);
  }

  /**
   * Test firstName.
   */
  @Test
    public void testFirst() {
    assertEquals("John", john.getFirstName());
  }
  
  /**
   * Test LastName.
   */
  @Test
    public void testSecond() {
    assertEquals("Doe", john.getLastName());
  }

  /**
   * Test year of birth.
   */
  @Test
    public void testYearOfBirth() {
    assertEquals(1945, john.getYearOfBirth());
  }

}
