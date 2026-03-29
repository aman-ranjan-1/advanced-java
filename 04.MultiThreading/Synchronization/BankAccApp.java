public class BankAccApp {
    public static void main(String[] args) {
        // shared account 
        BankAcc acc1 = new BankAcc(15000);

        // creating multiple threads 
        Thread withdrawThread = new Thread(() -> {acc1.withdraw(2000);});
        Thread depositThread = new Thread(() -> {acc1.deposit(6000);});
        Thread balanceThread = new Thread(() -> {double bal = acc1.getBalance();System.out.println("Balance = "+bal);});

        //start The Threads
        withdrawThread.start();
        depositThread.start();
        balanceThread.start();

        //might give unstructured and meaningless output (synchronization not used) 
        // Amount Deposited Successfull; New Balance : 19000.0
        // Withdrawl Succesfull . Remaining Balance 19000.0
        // Balance = 19000.0

        //after using synchronization - new output 
        // Withdrawl Succesfull . Remaining Balance 13000.0
        // Amount Deposited Successfull; New Balance : 19000.0
        // Balance = 19000.0
        
    }
}
