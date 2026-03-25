
import java.util.ArrayList;


public class GadgetAList {
    public static void main(String[] args) {
        ArrayList<Gadget> Gadgetlist = new ArrayList<>();
        
        //adding elements
        Gadgetlist.add(new Gadget("Iphone", 70000));
        Gadgetlist.add(new Gadget("Macbook", 120000));
        Gadgetlist.add(new Gadget("Ipad", 50000)); 
        Gadgetlist.add(new Gadget("Airbuds", 30000));
        // display
        System.out.println("List of Gadgets:");
        for (Gadget idx : Gadgetlist) {
            System.out.println(idx);
        }
    }
}
// Sample Output - 
// List of Gadgets:
// Gadget[name = Iphone, price = 70000.0]
// Gadget[name = Macbook, price = 120000.0]
// Gadget[name = Ipad, price = 50000.0]
// Gadget[name = Airbuds, price = 30000.0]