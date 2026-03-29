public class BankAcc2App {
    public static void main(String[] args) {
        // shared account 
        BankAcc2 acc1 = new BankAcc2(15000);

        // creating multiple threads 
        Thread withdrawThread = new Thread(() -> {acc1.withdraw(2000);});
        Thread depositThread = new Thread(() -> {acc1.deposit(6000);});
        Thread balanceThread = new Thread(() -> {double bal = acc1.getBalance();System.out.println("Balance = "+bal);});

        //start The Threads
        withdrawThread.start();
        depositThread.start();
        balanceThread.start();
    }
}
// sample output - 
// Withdrawl Succesfull . Remaining Balance 13000.0
// Amount Deposited Successfull; New Balance : 19000.0
// Balance = 19000.0
