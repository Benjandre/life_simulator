package GameMechanics;

public class Wallet {
    
    private double balance;

    public Wallet(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added " + amount + " to wallet. New balance: " + balance);
        } else {
            System.out.println("Amount to add must be positive.");
        }
    }

    public void spendMoney(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Spent " + amount + ". New balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Cannot spend " + amount);
        } else {
            System.out.println("Amount to spend must be positive.");
        }
    }
    
}
