package polynomial;

/**
 * The classs monomial creates a single term of the polynomial.
 * 
 * @author parthpatel
 *
 */
public class Monomial {
  private final int degree;
  private int coEfficient;

  /**
   * THe monomial instructor assigns the coefficients and degrees of each terms.
   * 
   * @param coefficient The coefficient of the term.
   * @param degree      the degreee of the polynomial.
   */
  public Monomial(int coefficient, int degree) {
    this.coEfficient = coefficient;
    this.degree = degree;
  }

  public int getCoEfficient() {
    return this.coEfficient;
  }

  public int getPower() {
    return this.degree;
  }

  /**
   * The to string method returns the string of individual terms.
   */
  public String toString() {
    if (this.degree > 0) {
      return "" + this.coEfficient + "x^" + this.degree;
    } else {
      return "" + this.coEfficient;
    }
  }
}
