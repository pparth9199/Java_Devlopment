package polynomial;

/**
 * This interface represents the List of polynomials ADT.
 */
public interface PolynomialListAdt {
  /**
   * Add a polynomial to the front of this list.
   * 
   * @param b the polynomial to be added to the front of this list
   */
  void addFront(Monomial b);

  /**
   * Add a polynomial to the back of this list (so it is the last polynomial in
   * the list.
   * 
   * @param b the polynomial to be added to teh back of this list
   */
  void addBack(Monomial b);

  /**
   * Add a polynomial to this list so that it occupies the provided index. Index
   * begins with 0.
   * 
   * @param index the index to be occupied by this polynomial, beginning at 0
   * @param b     the polynomial to be added to the list
   */
  void add(int index, Monomial b);

  /**
   * Return the number of polynomials currently in this list.
   * 
   * @return the size of the list
   */
  int getSize();

  /**
   * Remove the first instance of this polynomial from this list.
   * 
   * @param b the polynomial to be removed
   */
  void remove(Monomial b);

  /**
   * Get the (index)th polynomial in this list.
   * 
   * @param index the index of the polynomial to be returned
   * @return the polynomial at the given index
   * @throws IllegalArgumentException if an invalid index is passed
   */
  Monomial get(int index) throws IllegalArgumentException;
}