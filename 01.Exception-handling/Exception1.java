// Example code of Exception Handling
// use of 'try'block,'catch' block,'finally' block

// problem - solving the Arithmetic Exception / error in fraction
import java.util.*;
public class Exception1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numerator, denominator , result;
        System.out.println("Enter Numerator: ");
        numerator = in.nextInt();
        System.out.println("Enter Denominator: ");
        denominator = in.nextInt();
        // result = numerator/denominator;
        // System.out.println("Result is "+result);
        // the above commented code would give an error if denominator is Zero
        // Exception - Arithmetic exception 
        // here we use try block
        try {
            result = numerator/denominator; // in case give error then catch block will be applied from here
            System.out.println("Result = "+result);
        } catch (ArithmeticException e) {
            System.out.println("Error - "+e.getLocalizedMessage()+" Not Possible");
        }
        // finally block always executed (with or without Error)
        finally{
            System.out.println("Program End");
        }
    }
}
// Sample Output  

// IN CASE OF WITHOUT ERROR
// Enter Numerator: 
// 10
// Enter Denominator: 
// 4
// Result = 2
// Program End


// IN CASE OF ERROR- 
// Enter Numerator: 
// 10
// Enter Denominator: 
// 0
// Error - / by zero Not Possible
// Program End