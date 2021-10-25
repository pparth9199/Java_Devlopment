package polynomial;

/**
 * This interface represents all operations for a node in a list of polynomials
 * implemented as an ADT. The advantage of the ADT design is that this interface
 * may now represent operations on a single node, instead of the IListOfBooks
 * that represented nodes but the operations were really on lists.
 */
public interface PolynomialAdtNode {

  /**
   * Return the number of polynomials in this list.
   * 
   * @return the size of this list
   */
  int count();

  /**
   * Add the given polynomial to the front of this list and return this modified
   * list.
   * 
   * @param b the polynomial to be added
   * @return the head of the resulting list
   */
  PolynomialAdtNode addFront(Monomial b);

  /**
   * Add the given polynomial to the back of this list and return this modified
   * list.
   * 
   * @param b the polynomial to be added
   * @return the head of the resulting list
   */
  PolynomialAdtNode addBack(Monomial b);

  /**
   * A method that adds the given polynomial at the given index in this list . If
   * index is 0, it means this polynomial should be added to the front of this
   * list.
   * 
   * @param index the position to be occupied by this polynomial, starting at 0
   * @param b     the polynomial to be added
   * @return the head of the resulting list
   * @throws IllegalArgumentException if an invalid index is passed
   */
  PolynomialAdtNode add(int index, Monomial b) throws IllegalArgumentException;

  /**
   * Remove the first instance of this polynomial from the list.
   * 
   * @param b the polynomial to be removed
   * @return the head of the resulting list after the polynomial has been removed
   */
  PolynomialAdtNode remove(Monomial b);

  /**
   * Get the polynomial at the specified index, with 0 meaning the first
   * polynomial in this list.
   * 
   * @param index the specified index
   * @return the polynomial at the specified index
   * @throws IllegalArgumentException if an invalid index is passed
   */
  Monomial get(int index) throws IllegalArgumentException;
}