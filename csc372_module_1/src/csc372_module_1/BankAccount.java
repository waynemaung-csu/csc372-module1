package csc372_module_1;

public class BankAccount {

    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    // Constructor
    public BankAccount() {
        balance = 0.0;
    }

    // Deposit money
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdraw money
    public void withdrawal(double amount) {
        balance -= amount;
    }

    // Setter first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter first name
    public String getFirstName() {
        return firstName;
    }

    // Setter last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter last name
    public String getLastName() {
        return lastName;
    }

    // Setter account ID
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    // Getter account ID
    public int getAccountID() {
        return accountID;
    }

    // Getter balance
    public double getBalance() {
        return balance;
    }

    // Account summary
    public void accountSummary() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Account ID: " + accountID);
        System.out.printf("Balance: $%.2f%n", balance);
    }
}