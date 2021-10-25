package questions;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Class to test Multiple choice.
 */
public class MultipleChoiceTest {

  private Question mp;
  private Question msq;

  /**
   * Setting up the class.
   */
  @Before
  public void setUp() {
    mp = new MultipleChoice("What is Java?", "3", "2", "3", "4", "5", "6");
  }

  /**
   * Test the compare method for correct object.
   */
  @Test
  public void testCompare() {
    assertEquals(0, mp.compareTo(mp));
  }

  /**
   * Test compare for multiple select.
   */
  @Test
  public void testCompareError() {
    msq = new MultipleSelect("What is java?", "1 2 3", "1", "2", "3", "4");
    assertEquals(-1, mp.compareTo(msq));
  }

  /**
   * Testing true false object.
   */
  @Test
  public void testCompareErrorTf() {
    msq = new TrueFalse("What is java?", "1", "2", "2");
    assertEquals(1, mp.compareTo(msq));
  }

  /**
   * Testing likert object.
   */
  @Test
  public void testCompareErrorLikert() {
    msq = new Likert("What is java?");
    assertEquals(-1, mp.compareTo(msq));
  }

  /**
   * Testing answer correct one.
   */
  @Test
  public void testAnswer() {
    assertEquals("Correct", mp.answer("3"));
  }

  /**
   * Testing answer wrong one.
   */
  @Test
  public void testAnswer1() {
    assertEquals("Incorrect", mp.answer("2"));
  }

  /**
   * Testing incorrect option.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testAnswer2() {
    assertEquals("Incorrect", mp.answer("1 2"));
  }
}
