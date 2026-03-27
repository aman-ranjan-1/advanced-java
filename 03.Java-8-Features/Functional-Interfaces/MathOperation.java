// UNDERSTANDING FUNCTIONAL INTERFACES
@FunctionalInterface
public interface MathOperation {
    int operate(int a,int b); // abstract method - by default
    // functionalinterfacs hava one abstract method by default , Single Abstract Method 
}

// Class implementing the functional interface
class Addition implements MathOperation {
    @Override
    public int operate(int a, int b) {
        return a + b;
    }
}

