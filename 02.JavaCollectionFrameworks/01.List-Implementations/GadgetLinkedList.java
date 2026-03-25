// Understanding the concept of Linked List

import java.util.LinkedList;

public class GadgetLinkedList {
    public static void main(String[] args) {
        LinkedList<Gadget> gadgetlist = new LinkedList<>();

        // adding elements
        gadgetlist.add(new Gadget("Smartphone", 65000));
        gadgetlist.add(new Gadget("Laptop", 105000));
        gadgetlist.add(new Gadget("Earbuds", 5000));      
        
        System.out.println("List of Gadgets");
        for (Gadget elem : gadgetlist) {
            System.out.println(elem);
        }
        // removing the first element
        // removeFirst
        System.out.println();
        System.out.println("Remove First Element");
        gadgetlist.removeFirst();
        for (Gadget elem : gadgetlist) {
            System.out.println(elem);
        }
    }
}