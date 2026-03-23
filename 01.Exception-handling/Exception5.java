// Example code and explaination of Unchecked Exceptions 
// also known as run-time exceptions
// Unchecked exceptions - situations where recovery is not feasible


// example of an ArithmeticException

import java.util.Scanner;

public class Exception5 {
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
            in.close();
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