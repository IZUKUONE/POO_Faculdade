package nelioAlves.advanceInPoo.exercise.entities;

public class Account {
    private int account_number;
    private String name;
    private double account_balance;

    public Account(int account_number, String name, double initialDeposit) {
        this.account_number = account_number;
        this.name = name;
        deposit(initialDeposit);
    }
    public Account(int account_number, String name) {
        this.account_number = account_number;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getAccount_balance() {
        return account_balance;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double amount) {
        account_balance += amount;
    }
    public void withdraw(double amount) {
        account_balance -= amount + 5.0;
    }
}
