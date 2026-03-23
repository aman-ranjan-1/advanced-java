// example code and explaination of Custom Exceptions 
// lets take a scenario of a website that is related to Payments 
// the website or application only allows peoples over age 18 
// AgeTooYoungException

// used concepts - inheritance , constructors , Exception Handling

import java.util.*;
class AgeTooYoungException extends Exception{
    public AgeTooYoungException(String message){
        super(message);
    }
}
public class Exception6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Enter Your Age ");
        int age = in.nextInt();
        try {
            validateAge(age);
            System.out.println("Age is Valid");
        } catch (AgeTooYoungException e) {
            System.out.println("AgeTooYoungException Caught : "+e.getMessage());
        }
        finally{
            System.out.println("Program Executed");
        }
    }
    public static void validateAge (int age )throws AgeTooYoungException{
        if (age<=18){
            throw new AgeTooYoungException ("Age must be equal or over 18");
        }
    }
}
// sample output 1 
// Welcome
// Enter Your Age 
// 14
// AgeTooYoungException Caught : Age must be equal or over 18
// Program Executed

// sample output 2
// Welcome
// Enter Your Age 
// 20
// Age is Valid
// Program Executed