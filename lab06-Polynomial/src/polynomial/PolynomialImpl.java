package polynomial;

import java.util.Objects;

/**
 * The class polynomial impl implements the polynomial functions.
 * 
 * @author parthpatel
 *
 */
public class PolynomialImpl implements Polynomial {
  private PolynomialListAdt list;

  /**
   * The zero const to initialize a zero polynomial.
   */
  public PolynomialImpl() {
    this.list = new PolynomialListAdtImpl();
  }

  /**
   * The constructor takes in the string of polynomial and pasrses it.
   * 
   * @param poly the string of polynomial.
   */
  public PolynomialImpl(String poly) {
    if (poly == null) {
      Objects.requireNonNull(poly, "Polynomial must not be null");
    }
    this.list = new PolynomialListAdtImpl();

    int coeff = 1;
    int expo = 1;
    String[] arr = poly.split(" ");
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < arr.length; i++) {
      if (!arr[i].contains("x^")) {
        arr[i] = arr[i] + "x^0";
      }
    }
    for (int i = 0; i < arr.length; i++) {
      sb.append(arr[i]);
    }
    String str = sb.toString();

    String[] numbers = str.replace("^", "").split("((?=\\+)|(?=\\-)|x)");
    for (int i = 0; i < numbers.length; i += 2) {
      coeff = Integer.parseInt(numbers[i]);
      expo = Integer.parseInt(numbers[i + 1]);
      this.addTerm(coeff, expo);

    }
  }

  @Override
  public Polynomial add(Polynomial other) throws IllegalArgumentException {
    if (!(other instanceof PolynomialImpl)) {
      throw new IllegalArgumentException();
    }
    Polynomial p = new PolynomialImpl();
    for (int i = 0; i < list.getSize(); i++) {
      p.addTerm(this.list.get(i).getCoEfficient(), this.list.get(i).getPower());
    }
    for (int i = 0; i < ((PolynomialImpl) other).getList().getSize(); i++) {
      p.addTerm(((PolynomialImpl) other).getList().get(i).getCoEfficient(),
          ((PolynomialImpl) other).getList().get(i).getPower());

    }
    return p;

  }

  public PolynomialListAdt getList() {
    return this.list;
  }

  @Override
  public void addTerm(int coefficient, int power) throws IllegalArgumentException {
    if (power < 0) {
      throw new IllegalArgumentException();
    } else {
      int i = 0;
      while (i < this.list.getSize()) {
        if (this.list.get(i).getPower() == power) {
          int coE = this.list.get(i).getCoEfficient();
          this.list.remove(list.get(i));
          int sumCoef = coE + coefficient;
          this.list.addBack(new Monomial(sumCoef, power));
          break;
        } else {
          this.list.addBack(new Monomial(coefficient, power));
          break;
        }
      }
      if (this.list.getSize() == 0) {
        this.list.addBack(new Monomial(coefficient, power));
      }
    }
  }

  @Override
  public boolean isSame(Polynomial poly) {

    return poly.toString().equals(this.toString());
   
  }

  @Override
  public double evaluate(double x) {

    double sum = 0;
    for (int i = 0; i < this.list.getSize(); i++) {
      sum += this.list.get(i).getCoEfficient() * Math.pow(x, this.list.get(i).getPower());
    }
    return sum;
  }

  @Override
  public int getCoefficient(int power) {
    int coe = 0;
    for (int i = 0; i < list.getSize(); i++) {
      if (power == this.list.get(i).getPower()) {
        coe = this.list.get(i).getCoEfficient();
      }
    }
    return coe;
  }

  @Override
  public int getDegree() {
    int temp = 0;
    for (int i = 0; i < list.getSize(); i++) {
      if (this.list.get(i).getPower() > temp) {
        temp = this.list.get(i).getPower();
      }
    }
    return temp;
  }

  /**
   * The method returns a complete polynomial.
   */
  public String toString() {
    String s = "";
    for (int i = 0; i < list.getSize(); i++) {
      s = s + this.list.get(i).toString() + " ";
    }
    return s;
  }

}
