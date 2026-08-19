package csc372_module_1;

public class CheckingAccount extends BankAccount {

    private double interestRate;

    // Constructor
    public CheckingAccount() {
        super();
        interestRate = 0.0;
    }

    // Setter interest rate
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Getter interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Withdrawal include overdraft fee
    public void processWithdrawal(double amount) {
        withdrawal(amount);

        System.out.printf("Withdrawal amount: $%.2f%n", amount);

        if (getBalance() < 0) {
            withdrawal(30.00);
            System.out.println("WARNING: A $30.00 overdraft fee has been assessed.");
        }

        System.out.printf("Current balance: $%.2f%n", getBalance());
    }

    // show account info
    public void displayAccount() {
        accountSummary();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}