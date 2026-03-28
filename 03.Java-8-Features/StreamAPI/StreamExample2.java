
import java.util.stream.Stream;
public class StreamExample2 {
    public static void main(String[] args) {
        // stream
        Stream<Integer> numbers = Stream.of(1,2,3,4,5,6,7,8,9,10);
        int count1 = (int)numbers.filter(n -> n%2==0).count();
        System.out.println("Count of Numbers % 2 is "+count1);
    }
}
