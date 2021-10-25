package transmission;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test class to see if the implementation done by me works or not.
 *
 */
public class TransmissionTest {
  private AutomaticTransmission trans;
  
  /**
   * Setup method.
   */
  @Before
  public void setup() {
    trans = new AutomaticTransmission(5,10,15,20,35);
  }
  
  /**
   * Testing construction.
   */
  @Test(expected = IllegalArgumentException.class)
  public void ConstructTest() {
    new AutomaticTransmission(5,10,15,20,-35);
    new AutomaticTransmission(5,10,30,40,11);
  }
  
  /**
   * Increase speed test.
   */
  @Test
  public void IncreaseSpeedTest() {
    trans.increaseSpeed();
    assertEquals(1,trans.getSpeed());
  }
  
  /**
   * Decerease speed test.
   */
  @Test
  public void decreaseSpeedTest() {
    for (int i = 0;i < 5;i++) {
      trans.increaseSpeed();
    }
    trans.decreaseSpeed();
    assertEquals(4,trans.getSpeed());
  }
  
  /**
   * check for speed going below 0.
   */
  @Test(expected = IllegalStateException.class)
  public void zeroDec() {
    trans.decreaseSpeed();
  }
  
  /**
   * get speed test.
   */
  @Test
  public void getSpeedTest() {
    assertEquals(0,trans.getSpeed());
  }
  
  /**
   * getgear testing.
   */
  @Test
  public void getGearTest() {
    for (int i = 0;i < 100;i++) {
      trans.increaseSpeed();
    }
    assertEquals(6,trans.getGear());
  }
  
  /**
   * Testing toString().
   */
  @Test
  public void testString() {
    assertEquals("Transmission (speed = 0, gear = 0)",trans.toString());
  }
  
  /**
   * Testing equals fail.
   */
  @Test
  public void testEqualsFail() {
    assertEquals(false,new AutomaticTransmission(5,10,15,20,25)
        .equals(new AutomaticTransmission(5,10,15,21,25)));
  }

}
