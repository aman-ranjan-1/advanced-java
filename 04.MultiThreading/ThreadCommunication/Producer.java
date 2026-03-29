
import java.util.LinkedList;
import java.util.Random;
public class Producer implements Runnable {
    //buffer 
    private final LinkedList<Integer> buffer ;

    Producer(LinkedList<Integer> buffer){
        this.buffer = buffer ;
    }
    public void produce() throws InterruptedException{
        synchronized (buffer){
            while(buffer.size()==5){
                System.out.println("Producer is Waiting");
                buffer.wait(); //wait method 
            } //random numbers 
            Random r = new Random();
            int num = r.nextInt(100);
            System.out.println("Producer produced : "+num);
            buffer.add(num);
            buffer.notifyAll();
            Thread.sleep(10);
        }
    }
    @Override
    public void run(){
        //infinite producing
        while (true) { 
            try {
                this.produce();
            } catch (Exception e) {
                System.out.println("Exception caught : "+e.getMessage());
            }
        }
    }
}