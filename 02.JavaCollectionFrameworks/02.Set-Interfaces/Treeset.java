//understanding the concept of TreeSet
import java.util.*;
public class Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(20);
        numbers.add(40);
        numbers.add(2);
        numbers.add(1);
        numbers.add(21);
        numbers.add(19);
        numbers.add(7);
        numbers.add(5);
        for (int elem : numbers) {
            System.out.println(elem);
        }
        System.out.println();
        // displaying the number in ordered collection 
        // no need of Sorting
        
        // taking a different treeset of string type to see the results
        TreeSet<String> car = new TreeSet<>();
        car.add("BMW");
        car.add("Audi");
        car.add("Koensingg");
        car.add("Mercedes");
        car.add("Z-class");
        car.add("Chevrolet");
        car.add("Mahindra");
        car.add("Kia");
        System.out.println("Displaying Car List");
        for (Object cars : car) {
            System.out.println(cars);
        } // result displayed in alphabetical order 
        // lets see the size of the car treeset 
        System.out.println("Size of Car Treeset "+car.size());
        car.removeAll(car);
        System.out.println("After removing all cars - New Car Treeset");
        System.out.println(car);
    }
}
