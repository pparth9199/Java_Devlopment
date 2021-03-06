package polynomial;

/**
 * This class represents an element node in the list adt implementation.
 */
public class PolynomialListAdtElementNode implements PolynomialAdtNode {
  private Monomial m;
  private PolynomialAdtNode rest;

  /**
   * The constructor to initialize node element node.
   * 
   * @param m    The monomial constructor.
   * @param rest Rest of the list.
   */
  public PolynomialListAdtElementNode(Monomial m, PolynomialAdtNode rest) {
    this.m = m;
    this.rest = rest;
  }

  @Override
  public int count() {
    return 1 + this.rest.count();
  }

  @Override
  public PolynomialAdtNode addFront(Monomial m) {
    return new PolynomialListAdtElementNode(m, this);
  }

  @Override
  public PolynomialAdtNode addBack(Monomial m) {
    this.rest = this.rest.addBack(m);
    return this;
  }

  @Override
  public PolynomialAdtNode add(int index, Monomial m) {
    if (index == 0) {
      return addFront(m);
    } else {
      this.rest = this.rest.add(index - 1, m);
      return this;
    }
  }

  @Override
  public PolynomialAdtNode remove(Monomial m) {
    if (this.m.equals(m)) {
      return this.rest;
    } else {
      this.rest = this.rest.remove(m);
      return this;
    }
  }

  @Override
  public Monomial get(int index) throws IllegalArgumentException {
    if (index == 0) {
      return this.m;
    }

    return this.rest.get(index - 1);
  }

  @Override
  public String toString() {
    String returnString = this.m.toString();
    if (this.m.getCoEfficient() > 0) {
      returnString = "+" + returnString;
    }
    return returnString + " " + this.rest.toString();
  }
}