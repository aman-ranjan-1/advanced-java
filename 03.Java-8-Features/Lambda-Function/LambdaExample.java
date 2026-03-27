// understanding lambda function
public class LambdaExample {
    public static void main(String[] args) {
        Multiplication product = (a,b) -> a*b; //lambda expression
        int result = product.multiply(5, 10);
        System.out.println("Product is "+result);
    }
}

