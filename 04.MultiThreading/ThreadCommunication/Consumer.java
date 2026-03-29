
import java.util.LinkedList;

public class Consumer implements Runnable{
    //buffer,constructor ,run
    private final LinkedList<Integer> buffer ;

    Consumer(LinkedList<Integer> buffer){
        this.buffer = buffer ;
    }
    @Override
    public void run(){
        //infinite producing
        while (true) { 
            try {
                this.consume();
            } catch (Exception e) {
                System.out.println("Exception caught : "+e.getMessage());
            }
        }
    }
    public void consume () throws InterruptedException{
        synchronized(buffer){
            //buffer -> empty
            while(buffer.size()==0){
                System.out.println("Consumer is waiting");
                buffer.wait(); //wait method
            }
            //consume an item
            int num = buffer.remove(0);
            System.out.println("Consumer consumed : "+num);
            buffer.notifyAll(); //notify method
            Thread.sleep(5);
        }
    }
}
