// Example and Explanaton Code of Throwing Exceptions
// use of throw keyword

import java.util.*;

public class Exception3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // age as an input -> might be valid or invalid age
        int age;
        try {
            System.out.print("Enter Age : ");
            age = in.nextInt();//might be positive or negative val
            validateAge(age);
            System.out.println("Age is Valid");
        }
        catch(IllegalArgumentException e){
            System.out.println("IllegalArgumentException caught :"+e.getMessage() );
        }
    }
    public static void validateAge(int age){
        if( age <= 0 ){
            //throw -> custom message
            throw new IllegalArgumentException("Age cannot be negative or zero");
        }
    }
}
// sample output 1 
// Enter Age : 0
// IllegalArgumentException caught :Age cannot be negative or zero

// sample output 2
// Enter Age : -1
// IllegalArgumentException caught :Age cannot be negative or zero

// sample output 3
// Enter Age : 10
// Age is Valid
