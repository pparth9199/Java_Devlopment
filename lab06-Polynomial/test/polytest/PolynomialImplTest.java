package polytest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import polynomial.Polynomial;
import polynomial.PolynomialImpl;

/**
 * The test class for the polynomial implementation.
 * 
 * @author parthpatel
 *
 */
public class PolynomialImplTest {
  private Polynomial p;

  /**
   * The setup method for the polynomial constructor.
   * 
   * @throws Exception throws illegal asrgument exception.
   */
  @Before
  public void setUp() throws Exception {
    p = new PolynomialImpl("2x^2 +3x^1 -3 +2x^2");
  }

  /**
   * Testing getCoefficient method for right positive answer.
   */
  @Test
  public void getCoefficientTest() {
    assertEquals(4, p.getCoefficient(2));
  }

  /**
   * Testing getCoefficient method for 0.
   */
  @Test
  public void getCoefficientTestZero() {
    assertEquals(0, p.getCoefficient(6));
  }

  /**
   * Testiing the getDegree method.
   */
  @Test
  public void getDegreeTest() {
    assertEquals(2, p.getDegree());
  }

  /**
   * Testiing the getDegree method for constant.
   */
  @Test
  public void getDegreeTestzero() {
    Polynomial pz = new PolynomialImpl("1");
    assertEquals(0, pz.getDegree());
  }

  /**
   * Testing evaluate method for positive x.
   */
  @Test
  public void getEvaluatePositive() {
    assertEquals(4, p.evaluate(1), 0.0f);
  }

  /**
   * Testing evaluate method for negative x.
   */
  @Test
  public void getEvaluateNegative() {
    assertEquals(-2, p.evaluate(-1), 0.0f);
  }

  /**
   * Testing isSame for 0.
   */
  @Test
  public void getisSameTestZero() {
    assertEquals(false, p.isSame(new PolynomialImpl("0")));
  }

  /**
   * Testing isSame for atleast one term with same power.
   */
  @Test
  public void getisSameTestSamePower() {
    assertEquals(false, p.isSame(new PolynomialImpl("2x^2 +4x^1 -2")));
  }

  /**
   * Testing isSame for no same power.
   */
  @Test
  public void getisSameTestNoSamePower() {
    assertEquals(false, p.isSame(new PolynomialImpl("3x^3 +4x^4 -5x^5")));
  }

  /**
   * Testing the add Term method for non existant.
   */
  @Test
  public void addTermTestNon() {
    p.addTerm(4, 3);
    assertEquals("3x^1 -3 4x^2 4x^3 ", p.toString());
  }

  /**
   * Testing the add Term method for existant.
   */
  @Test
  public void addTermTestExist() {
    p.addTerm(2, 1);
    assertEquals("-3 4x^2 5x^1 ", p.toString());
  }

  /**
   * Testing the add Term method for exception.
   */
  @Test(expected = IllegalArgumentException.class)
  public void addTermTestEceptt() {
    p.addTerm(2, -1);
    assertEquals("-3 4x^2 5x^1 ", p.toString());
  }

  /**
   * Testing add method for 0 polynomial.
   */
  @Test
  public void addTestZero() {
    p.add(new PolynomialImpl("0"));
    assertEquals("3x^1 -3 4x^2 ", p.toString());
  }

  /**
   * Testing add method for nosame power polynomial.
   */
  @Test
  public void addTestNoSame() {
    Polynomial x = p.add(new PolynomialImpl("2x^6 +4x^5"));
    assertEquals("3x^1 -3 4x^2 2x^6 4x^5 ", x.toString());
  }
  
  /**
   * Testing add method for same power.
   */
  @Test
  public void addTestSame() {
    Polynomial x = p.add(new PolynomialImpl("2x^1 +4"));
    assertEquals("4x^2 5x^1 1 ", x.toString());
  }
  
  /**
   * Testing toString for 1 coefficient.
   */
  @Test
  public void toStringTest() {
    Polynomial x = new PolynomialImpl("1x^1");
    assertEquals("1x^1 ",x.toString());
  }
  
  /**
   * Testing multiple term polynomial.
   */
  @Test
  public void toStringTestPoly() {
    assertEquals("3x^1 -3 4x^2 ",p.toString());
  }
  
  /**
   * Testing constructor.
   */
  @Test(expected = NullPointerException.class)
  public void constTest() {
    assertEquals("",new PolynomialImpl(null));
  }
  
  /**
   * Testing constructor for constant.
   */
  @Test
  public void ConstTestConst() {
    Polynomial x = new PolynomialImpl("2");
    assertEquals("2 ",x.toString());
  }
  
  /**
   * Testing constructor for constant.
   */
  @Test
  public void ConstTestSamePower() {
    Polynomial x = new PolynomialImpl("2x^2 +3x^2");
    assertEquals("5x^2 ",x.toString());
  }
  
  /**
   * Testing constructor for constant.
   */
  @Test
  public void ConstTestUnique() {
    Polynomial x = new PolynomialImpl("2x^3 +2x^2");
    assertEquals("2x^3 2x^2 ",x.toString());
  }
}
