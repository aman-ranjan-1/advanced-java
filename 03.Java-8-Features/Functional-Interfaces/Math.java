public class Math {
    public static void main(String[] args) {
        
        MathOperation add = new Addition();
        int result = add.operate(10, 5);
        
        System.out.println("Addition: " + result);
    }
}