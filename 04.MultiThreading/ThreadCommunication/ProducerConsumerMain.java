// understanding the thread communication and coordination
import java.util.LinkedList;

public class ProducerConsumerMain {
    public static void main(String[] args) {
            LinkedList<Integer> buffer = new LinkedList<>();
            Producer p = new Producer(buffer);
            Consumer c = new Consumer(buffer);

            // threads
            Thread pThread = new Thread(p);
            Thread cThread = new Thread(c);

            //thread start 
            pThread.start();
            cThread.start();
    }
}
