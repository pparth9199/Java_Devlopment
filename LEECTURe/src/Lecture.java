
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Lecture {

  public static void main(String[] args) {
    int[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};
    String[] strings = { "Red", "orange", "Yellow", "green", 
        "Blue", "indigo", "Violet" };

    
    IntStream.of(values).forEach(System.out::println);
    
    List<Integer> listValues = Arrays.stream(values).boxed().collect(Collectors.toList());
    System.out.println("c");
    IntStream.of(values).filter(x->x>4).sorted().forEach(System.out::println);
    
    Arrays.stream(strings).forEach(System.out::println);
 
    List<String> strValues = Arrays.stream(strings).map(x->x.toUpperCase()).collect(Collectors.toList());
    
    
  }

}
