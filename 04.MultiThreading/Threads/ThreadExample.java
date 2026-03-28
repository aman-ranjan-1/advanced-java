public class ThreadExample {
    public static void main(String[] args) {
        MyThreads thread1 = new MyThreads();
        MyThreads thread2 = new MyThreads();
        //start the threads - use thread methods
        thread1.start();
        thread2.start();
    }
}
