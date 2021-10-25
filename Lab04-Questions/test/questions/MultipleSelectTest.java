package questions;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test class for multiple select option.
 * 
 * @author parthpatel
 *
 */
public class MultipleSelectTest {
  private Question ms;
  private Question test;

  /**
   * Setting up the method to test multiple select.
   */
  @Before
  public void setUp() {
    ms = new MultipleSelect("What is JAVA?", "1 2 3", "1", "2", "3", "4", "5");
  }

  /**
   * Testing the compare method.
   */
  @Test
  public void testCompare() {
    assertEquals(0, ms.compareTo(ms));
  }

  /**
   * Testing the compare for multiple choice object.
   */
  @Test
  public void testCompareError() {
    test = new MultipleChoice("What is java?", "1", "1", "2", "3", "4");
    assertEquals(1, ms.compareTo(test));
  }

  /**
   * Testing true false object.
   */
  @Test
  public void testCompareErrorTf() {
    test = new TrueFalse("What is java?", "1", "2", "2");
    assertEquals(1, ms.compareTo(test));
  }

  /**
   * Testing for likert object.
   */
  @Test
  public void testCompareErrorLikert() {
    test = new Likert("What is java?");
    assertEquals(-1, ms.compareTo(test));
  }

  /**
   * Testing contructor for illegal arguement.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testConstruct() {
    assertEquals(" ", new MultipleSelect("What is JAVA?", "1 2", "1", "2"));
  }

  /**
   * Testing the constructor for more options in correct ans than actual choices.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testConstruct1() {
    assertEquals("", new MultipleSelect("What is JAVA?", "1 2 3", "1", "2"));
  }

  /**
   * Testinf the test answer method.
   */
  @Test
  public void testAnswer() {
    assertEquals("Correct", ms.answer("1 2 3"));
  }

  /**
   * Testing the wrong value for answer method.
   */
  @Test
  public void testAnswer1() {
    assertEquals("Incorrect", ms.answer("1 2 "));
  }

  /**
   * Testing for incorrect answer.
   */
  @Test
  public void testAnswer2() {
    assertEquals("Incorrect", ms.answer("1 2 4"));
  }

  /**
   * Testing for text.
   */
  @Test
  public void testText() {
    assertEquals("What is JAVA?", ms.getText());
  }

}
