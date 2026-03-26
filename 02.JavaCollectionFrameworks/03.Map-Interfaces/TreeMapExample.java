// Understanding the concept of TreeMap

import java.util.*;
public class TreeMapExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeMap<String,Integer> cars = new TreeMap<>();

        //adding elements
        cars.put("Mercedes", 2000000);
        cars.put("Audi", 1500000);
        cars.put("BMW", 2500000);
        cars.put("Skoda", 1200000);
        cars.put("Mahindra", 500000);
        cars.put("Chevrolet", 700000);

        System.out.println(" Cars Details");
        System.out.println(cars);

        // output -  Cars Details
        //{Audi=1500000, BMW=2500000, Chevrolet=700000, Mahindra=500000, Mercedes=2000000, Skoda=1200000}
        //result in sorted order 
        // can perform every method as HashMap Methods

        System.out.println("Enter Car Details to Add : ");
        System.out.println("Enter name of Car - ");
        String Carname = in.next();
        System.out.println("Enter its price ");
        int Carprice = in.nextInt();
        cars.put(Carname, Carprice);
        System.out.println(Carname+" added successfully");
        System.out.println("New Car TreeMap");
        System.out.println(cars);
        // output - 
        // Enter Car Details to Add : 
        // Enter name of Car - 
        // Lamborghini
        // Enter its price 
        // 5000000
        // Lamborghini added successfully
        // New Car TreeMap
        // {Audi=1500000, BMW=2500000, Chevrolet=700000, Lamborghini=5000000, Mahindra=500000, Mercedes=2000000, Skoda=1200000}
        
    }
}
