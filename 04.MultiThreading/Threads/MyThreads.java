public class MyThreads extends Thread{
    // override - run method
    @Override 
    public void run(){
        //own logic according to our program
        // loop running 1-5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Threads : "+Thread.currentThread().getId()+" Count : "+i);
        }
    }
} // Both threads running at same time - both are independent with each other
// sample output - 
// Threads : 26 Count : 1
// Threads : 26 Count : 2
// Threads : 27 Count : 1
// Threads : 27 Count : 2
// Threads : 27 Count : 3
// Threads : 27 Count : 4
// Threads : 27 Count : 5
// Threads : 26 Count : 3
// Threads : 26 Count : 4
// Threads : 26 Count : 5