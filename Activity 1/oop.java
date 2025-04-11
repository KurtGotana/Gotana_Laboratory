//Parent class
class BankAccount {

    private String accountHolderName;
    private double balance;

    // constructor
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        this.balance = +this.balance + amount;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double amount) {
        if (amount > 0 == true) {
            balance += amount;
            System.out.println("Deposited Amount: " + amount);
        } else {
            System.out.println("Unsable to Deposit Amount: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Succesfully Withdrawed " + amount);
        } else {
            System.out.println("Unable to Withdraw Amount.");
        }
    }

    // polymorphism\

    public void displayAccountDetails() {
        System.out.println("Account Holder " + accountHolderName);
        System.out.println("Account Balance " + balance);
    }
}

class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String accountHolderName, double initialBalance, double interestRate) {
        super(accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate);
    }
}

class CurrentAccount extends BankAccount {

    private double overdraftLimit;

    public CurrentAccount(String accountHolderName, double initialBalance, double overdraftLimit) {
        super(accountHolderName, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= (getBalance() + overdraftLimit)) {
            double newBalance = getBalance() - amount;
            if (newBalance < 0) {
                overdraftLimit += newBalance;
            }
            super.setBalance(-amount);
            System.out.println("Succesfully Withdrawed " + amount);
        } else {
            System.out.println("Unable to Withdraw Amount.");
        }
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

// main class
public class oop {

    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount("Dave", 1000, 5);
        savings.displayAccountDetails();
        savings.deposit(500);
        savings.calculateInterest();
        savings.withdraw(200);
        System.out.println();

        // creating current account
        CurrentAccount current = new CurrentAccount("Joe", 500, 500);
        current.displayAccountDetails();
        current.withdraw(500);

        System.out.println();
        current.displayAccountDetails();
    }

}
