// example code and explaination of Checked Exceptions
// Checked exceptions are exceptions that the java compiler checks at compilation time

// Example of ClassNotFoundException
public class Exception4 {
    public static void main(String[] args) {
        try {
            Class temp = Class.forName("Example");// change the classname as Example or as your choice 
            System.out.println("Class Found");
        } catch (ClassNotFoundException e) {
            System.out.println("Class does not exist , check the name of the class");
        }
        finally{
            System.out.println("Program Executed");
        }
    }
}
// lets take an example class named Example / only made for understanding checked exceptions 
// 
class Example{
}

// sample output 1 - 
// (when Example Class is called)

// Class Found
// Program Executed

// sample output 2 - 
// (when non existing class is called)

// Class does not exist , check the name of the class
// Program Executed