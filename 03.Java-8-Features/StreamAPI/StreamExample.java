
// understanding StreamAPI
import java.util.*;

public class StreamExample {
    public static void main(String[] args) {
        // list numbers -> sum even
        List<Integer> numbers = Arrays.asList(10,25,35,40,66,79,44,85);

        //even numbers 

        int sum_even = numbers.stream().filter( n -> n%2==0).mapToInt(Integer :: intValue).sum(); 
        //return sequential stream values(converted list of numbers to stream)
        System.out.println("Sum of Even Numbers "+sum_even);
    }
}
