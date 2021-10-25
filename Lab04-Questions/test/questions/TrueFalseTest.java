package questions;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Class to test True or False type questions.
 * 
 * @author parthpatel
 *
 */
public class TrueFalseTest {
  private Question tf;
  private Question test;

  /**
   * Setting up true false method.
   */
  @Before
  public void setUp() {
    tf = new TrueFalse("Java is a programing Language", "1", "2", "1");
  }

  /**
   * Testing fot the right answer.
   */
  @Test
  public void testAnswer() {
    assertEquals("Correct", tf.answer("1"));
  }
  
  /**
   * Testing for the incorrect answer.
   */
  @Test 
  public void testAnswer1() {
    assertEquals("Incorrect",tf.answer("2"));
  }
  
  /**
   * Testing the getText method.
   */
  @Test
  public void testText() {
    assertEquals("Java is a programing Language",tf.getText());
  }
  
  /**
   * Test the compare for the current object.
   */
  @Test
  public void testCompare() {
    assertEquals(0, tf.compareTo(tf));
  }

  /**
   * Testing the multiple choice object.
   */
  @Test
  public void testCompareError() {
    test = new MultipleChoice("What is java?", "1", "1", "2", "3", "4");
    assertEquals(-1, tf.compareTo(test));
  }

  /**
   * Testing multiple select object.
   */
  @Test
  public void testCompareErrorTf() {
    test  = new MultipleSelect("What is java?", "1 2 3", "1", "2", "3", "4");
    assertEquals(-1, tf.compareTo(test));
  }

  /**
   * Testing likert object.
   */
  @Test
  public void testCompareErrorLikert() {
    test = new Likert("What is java?");
    assertEquals(-1, tf.compareTo(test));
  }

}
