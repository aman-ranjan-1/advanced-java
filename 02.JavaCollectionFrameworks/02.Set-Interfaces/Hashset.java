
import java.util.HashSet;
import java.util.Scanner;

// Understanding the concept of HashSet

public class Hashset {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> car = new HashSet<>(); 
        // adding cars
        car.add("Volvo");
        car.add("BMW");
        car.add("Mercedes");
        car.add("Ford");
        car.add("BMW");
        // display
        for (String cars : car) {
            System.out.println(cars);
        }
        // displaying unordered collection (Displaying one BMW instead of Two)

        // checking a particular element - contains() method
        System.out.println("Enter a car to check if available or not");
        String checkcar = in.next();
        String Check = (car.contains(checkcar)?"Available ":"Not Available");
        System.out.println(Check);

        // removing a element
        System.out.println("Enter a car to remove");
        String RemoveCar = in.next();
        car.remove(RemoveCar);
        System.out.println("After Removing "+RemoveCar+" New Car Set");
        for (String cars : car) {
            System.out.println(cars);
        }
    }
}
