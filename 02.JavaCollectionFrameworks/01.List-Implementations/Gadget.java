// creating Arraylist of type gadget
public class Gadget {
    private String name;
    private double price;

    public Gadget(String gadgetname , double gadgetprice) {
        this.name=gadgetname;
        this.price=gadgetprice;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return "Gadget[name = "+name+", price = "+price+"]";
    }
    
    
}
