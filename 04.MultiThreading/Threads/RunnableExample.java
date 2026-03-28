public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable runobj = new MyRunnable();
        //create a thread
        Thread thread1 = new Thread(runobj);
        Thread thread2 = new Thread(runobj);
        //start the thread
        thread1.start();
        thread2.start();
    }
}
// both threads running concurrently 

// sample output - 
// Threads : 27 Count : 1
// Threads : 26 Count : 1
// Threads : 26 Count : 2
// Threads : 26 Count : 3
// Threads : 26 Count : 4
// Threads : 27 Count : 2
// Threads : 27 Count : 3
// Threads : 27 Count : 4
// Threads : 27 Count : 5
// Threads : 26 Count : 5
