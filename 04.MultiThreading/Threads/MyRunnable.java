public class MyRunnable implements Runnable{
    // override - run method
    @Override 
    public void run(){
        //own logic according to our program
        // loop running 1-5
        for (int i = 1; i <= 5; i++) {
        System.out.println("Threads : "+Thread.currentThread().getId()+" Count : "+i);
        }
    }
}