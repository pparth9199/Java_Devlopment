package weather;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * This a Junit test class for StevensonReading class.
 *
 */
public class StevensonReadingTest {
  private StevensonReading reading;

  /**
 * Setup Method.
 */
  @Before
  public void setUp() {
    reading = new StevensonReading(23,12,3,12);
  }
  
  /**
   * Testing temperature.
   */
  @Test
  public void testTemperature() {
    assertEquals(23,reading.getTemperature());
  }
  
  /**
   * Exception test case.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testDewTempException() { 
    new StevensonReading(23,25,3,12);
  }
  
  /**
   * Exception test case.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testspeedException() {
    new StevensonReading(23,25,-3,12);
  }
  
  /**
   * Exception test case.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testRain() {
    new StevensonReading(23,25,3,-12);
  }
  
  /**
   * Test case for dewPoint Temperature.
   */
  @Test
  public void testdewPoint() {
    assertEquals(12,reading.getDewPoint());
  }
  
  /**
   * Test case for wind speed.
   */
  @Test
  public void testWindSpeed() {
    assertEquals(3,reading.getWindSpeed());
  }
  
  /**
   * Test case for totalRain.
   */
  @Test
  public void testTotalRain() {
    assertEquals(12,reading.getTotalRain());
  }
  
  /**
   * Test case for testing relative Humidity.
   */
  @Test
  public void testRelativeHumidity() {
    assertEquals(45,reading.getRelativeHumidity());
  }
  
  /**
   * Test case for heat index.
   */
  @Test
  public void testHeatIndex() {
    assertEquals(25,reading.getHeatIndex());
  }
  
  /**
   * Test case for windchill.
   */
  @Test
  public void testWindChill() {
    assertEquals(76,reading.getWindChill());
  }
  
  /**
   * Testing equals method.
   */
  @Test
  public void testEquals() {
    assertEquals(true,new StevensonReading(23,14,5,13).equals(new StevensonReading(23,14,5,13)));
  }
  
  /**
   * Testing equals fail.
   */
  @Test
  public void testEqualsFail() {
    assertEquals(false,new StevensonReading(23,14,5,13).equals(new StevensonReading(23,4,5,1)));
  }
  
  /**
   * Testing toString().
   */
  @Test
  public void testString() {
    assertEquals("Reading: T = 23, D = 12, v = 3, rain = 12",reading.toString());
  }
  
  

}
