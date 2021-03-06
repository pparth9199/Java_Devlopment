package polynomial;

/**
 * This class implements the List of Monomial ADT.
 */
public class PolynomialListAdtImpl implements PolynomialListAdt {
  private PolynomialAdtNode head;

  /**
   * The polynomial list implementation for the list of polynomials.
   */
  public PolynomialListAdtImpl() {
    head = new PolynomialListAdtEmptyNode();
  }

  @Override
  public void addFront(Monomial b) {
    head = head.addFront(b);
  }

  @Override
  public void addBack(Monomial b) {
    head = head.addBack(b);
  }

  @Override
  public void add(int index, Monomial b) {
    head = head.add(index, b);
  }

  @Override
  public int getSize() {
    return head.count();
  }

  @Override
  public void remove(Monomial b) {
    head = head.remove(b);
  }

  @Override
  public Monomial get(int index) throws IllegalArgumentException {
    if ((index >= 0) && (index < getSize())) {
      return head.get(index);
    } else {
      throw new IllegalArgumentException("Invalid index");
    }
  }

  @Override
  public String toString() {
    return head.toString();
  }
}