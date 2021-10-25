package polynomial;

/**
 * This class represents an empty node in the list adt implementation.
 */
public class PolynomialListAdtEmptyNode implements PolynomialAdtNode {
  @Override
  public int count() {
    return 0;
  }

  @Override
  public String toString() {
    return "";
  }

  @Override
  public PolynomialAdtNode addFront(Monomial m) {
    return new PolynomialListAdtElementNode(m, this);
  }

  @Override
  public PolynomialAdtNode addBack(Monomial m) {
    return addFront(m);
  }

  @Override
  public PolynomialAdtNode add(int index, Monomial m) throws IllegalArgumentException {
    if (index == 0) {
      return addFront(m);
    }
    throw new IllegalArgumentException("Invalid index to add an element");
  }

  @Override
  public PolynomialAdtNode remove(Monomial b) {
    return this; // cannot remove from nothing!
  }

  @Override
  public Monomial get(int index) throws IllegalArgumentException {
    throw new IllegalArgumentException("Wrong index");
  }
}