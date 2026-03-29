// understanding reentrant locks 
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
public class BankAcc2 {
    // creating an acc 
    private double Balance;

    // creatin instance of Reentrant Lock
    private final Lock newLock = new ReentrantLock();

    public BankAcc2(double initialBalance){
        this.Balance = initialBalance;
    }
    // locking every method

    public void withdraw(double amount){
        newLock.lock(); //acquires the lock
        try{
            if(amount < Balance && amount >= 0){
                Balance -= amount;
                System.out.println("Withdrawl Succesfull . Remaining Balance "+Balance);
            }
             else{
                System.out.println("Withdrawl failed , Insufficient Balance");
            }
        }
        finally{
            newLock.unlock(); // release the lock
        }
    }
    public void deposit(double amount){
        newLock.lock();
        try{
            if (amount > 0){
                Balance += amount;
                System.out.println("Amount Deposited Successfull; New Balance : "+Balance);
            }
            else{
                System.out.println("Deposit Failed , Invalid Amount");
            }
        }
        finally{
            newLock.unlock();   
        }
    }
    public double getBalance(){
        newLock.lock();
        try {
            return Balance;
        }
        finally{
            newLock.unlock();
        }
    }
}
