class BankAccount {
    private double balance = 0;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}

class NotificationService {
    public void sendNotification(String message) {
        System.out.println("[Notification]: " + message);
    }
}

class Logger {
    public void log(String message) {
        System.out.println("[Log]: " + message);
    }
}

class BankingApp {
    private BankAccount account = new BankAccount();
    private NotificationService notifier = new NotificationService();
    private Logger logger = new Logger();

    public void depositMoney(double amount) {
        account.deposit(amount);
        notifier.sendNotification("Deposit successful");
        logger.log("Deposited amount: " + amount);
    }

    public void withdrawMoney(double amount) {
        account.withdraw(amount);
        notifier.sendNotification("Withdrawal attempted");
        logger.log("Withdraw request: " + amount);
    }

    public void showBalance() {
        System.out.println("Current Balance: " + account.getBalance());
    }
}

public class Main {
    public static void main(String[] args) {
        BankingApp app = new BankingApp();

        app.depositMoney(1000);
        app.withdrawMoney(300);
        app.withdrawMoney(800);
        app.showBalance();
    }
}