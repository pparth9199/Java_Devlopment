import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import person.Book;
import person.Person;

/**
 * Book test cases.
 */
public class BookTest {
  private Book sampleBook;
  private Person john;
  /**
   * setting up the classes.
   */
  
  @Before
    public void initialSetUp() {
    john = new Person("John","Doe",1945);
    sampleBook = new Book("Title of a Book",john,14.99f);
  }
  
  /**
  * Sample testCase1.
  */
  @Test
    public void testSomethingImportant() {
    int expected = 3;
    assertEquals(expected,3);
  }
  
  /**
   * Sample testCase2.
   */
  @Test
    public void testAnotherThing() {
    String expected = "Northeastern";
    assertEquals(expected,"Northeastern");
  }
  
  /**
   * Testing the title of the book.
   */
  @Test
    public void testTitle() {
    assertEquals("Title of a Book",sampleBook.getTitle());
  }
  
  /**
   * Testing the author of the book.
   */
  @Test
    public void testAuthor() {
    assertEquals(john,sampleBook.getAuthor());
  }
  
  /**
   * Testing the price of the book.
   */
  @Test
    public void testPrice() {
    assertEquals(14.99f,sampleBook.getPrice(),0.000);
  }
}
