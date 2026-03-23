// Example code showing Multiple Catch Blocks
// Showing multiple exception handling

import java.util.*;

public class Exception2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements of Array");
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = in.nextInt();
        }
        System.out.println("Given array is : ");
        System.out.println(Arrays.toString(arr));
        int num,denominator;
        System.out.println("Choose Numerator from your array (Enter index value)");
        num = in.nextInt();
        System.out.println("Enter Denominator ");
        denominator  = in.nextInt();
        // int result = arr[num]/denominator;
        // System.out.println("Result is "+result);
        try {
            int result = (arr[num])/denominator;
            System.out.println("Result is "+result);
        } 
        // using multiple catch blocks for multiple exception
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught "+e.getMessage());
        } //Exception ArrayIndexOutOfBoundsException
        catch(ArithmeticException e){
            System.out.println("ArithmeticException caught "+e.getMessage());
        } //ArithmeticException
        catch(InputMismatchException e){
            System.out.println("InputMismatchException "+e.getMessage());
        }
        catch(Exception e ){
            System.out.println("Exception Caught");
        }// IF any other exceptions found
        finally{
            System.out.println("Program Executed");
        }
    }
}
// Some Sample Output 
// 
// output 1 (without using Exception Handling)
// Enter Size of Array:
// 3
// Enter Elements of Array
// 10 20 30
// Given array is : 
// [10, 20, 30]
// Choose Numerator from your array (Enter index value)
// 4
// Enter Denominator 
// 2
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
//         at Exception2.main(Exception2.java:23)

// Sample Output 2 (in case of ArrayIndexOutOfBoundsException)
// Enter Size of Array:
// 3
// Enter Elements of Array
// 10 20 30 40 
// Given array is : 
// [10, 20, 30]
// Choose Numerator from your array (Enter index value)
// Enter Denominator 
// 2
// ArrayIndexOutOfBoundsException caught Index 40 out of bounds for length 3
// Program Executed

// Sample Output 3 (in case of ArithmeticException)
// Enter Size of Array:
// 3
// Enter Elements of Array
// 10 20 30
// Given array is : 
// [10, 20, 30]
// Choose Numerator from your array (Enter index value)
// 2
// Enter Denominator 
// 0
// ArithmeticException caught / by zero
// Program Executed

// Sample Output 4
// Enter Size of Array:
// 3
// Enter Elements of Array
// 10 20 30
// Given array is : 
// [10, 20, 30]
// Choose Numerator from your array (Enter index value)
// 2
// Enter Denominator 
// 2
// Result is 15
// Program Executed