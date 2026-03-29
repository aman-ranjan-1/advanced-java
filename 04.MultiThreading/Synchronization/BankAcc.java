
public class BankAcc {
    // creating an acc 
    private double Balance;

    public BankAcc(double initialBalance){
        this.Balance = initialBalance;
    }
    // synchronizing every method

    public synchronized void withdraw(double amount){
        if(amount < Balance && amount >= 0){
            Balance -= amount;
            System.out.println("Withdrawl Succesfull . Remaining Balance "+Balance);
        }
        else{
            System.out.println("Withdrawl failed , Insufficient Balance");
        }
    }
    public synchronized void deposit(double amount){
        if (amount > 0){
            Balance += amount;
            System.out.println("Amount Deposited Successfull; New Balance : "+Balance);
        }
        else{
            System.out.println("Deposit Failed , Invalid Amount");
        }
    }
    public synchronized double getBalance(){
        return Balance;
    }
}