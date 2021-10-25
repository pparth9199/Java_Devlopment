package questions;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 *Testing likert class.
 */
public class LikertTest {
  private Question likert;
  private Question test;

  /**
   * Setting up likert class.
   */
  @Before
  public void setUp() {
    likert = new Likert("Do you agree JAVA is hard?");
  }

  /**
   * Testing getText().
   */
  @Test
  public void testText() {
    assertEquals("Do you agree JAVA is hard?", likert.getText());
  }

  /**
   * Testing answer for correct one.
   */
  @Test
  public void testAnswer() {
    assertEquals("Correct", likert.answer("1"));
  }

  /**
   * Testing answer for incorrect one.
   */
  @Test
  public void testAnswer1() {
    assertEquals("Incorrect", likert.answer("6"));
  }

  /**
   * Testing answer for incorrect one.
   */
  @Test
  public void testAnswer2() {
    assertEquals("Incorrect", likert.answer(" "));
  }

  /**
   * Testing answer fo incorrect one.
   */
  @Test
  public void testAnswer3() {
    assertEquals("Incorrect", likert.answer("0"));
  }

  /**
   * Testing compareTo method.
   */
  @Test
  public void testCompare() {
    assertEquals(0, likert.compareTo(likert));
  }

  /**
   * Testing compare to check if multiple select object.
   */
  @Test
  public void testCompareError() {
    test = new MultipleSelect("What is java?", "1 2 3", "1", "2", "3", "4");
    assertEquals(1, likert.compareTo(test));
  }

  /**
   * Testing for true false object.
   */
  @Test
  public void testCompareErrorTf() {
    test = new TrueFalse("What is java?", "1", "2", "2");
    assertEquals(1, likert.compareTo(test));
  }

  /**
   * Testing for likert object.
   */
  @Test
  public void testCompareErrorMultipleChoice() {
    test = new MultipleChoice("What is java?", "1", "1", "2", "3", "4");
    assertEquals(1, likert.compareTo(test));
  }

}
