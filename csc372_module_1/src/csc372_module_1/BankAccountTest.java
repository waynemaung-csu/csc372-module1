package csc372_module_1;

public class BankAccountTest {

    public static void main(String[] args) {

        // Create checking account
        CheckingAccount account = new CheckingAccount();

        // Set account info
        account.setFirstName("John");
        account.setLastName("Smith");
        account.setAccountID(12345);
        account.setInterestRate(1.5);

        // Display initial account info
        System.out.println("===== INITIAL ACCOUNT =====");
        account.displayAccount();

        // Test deposit
        System.out.println("\n===== DEPOSIT TEST =====");
        account.deposit(500.00);
        System.out.println("Deposited: $500.00");
        System.out.printf("Balance: $%.2f%n", account.getBalance());

        // Test normal withdrawal
        System.out.println("\n===== NORMAL WITHDRAWAL TEST =====");
        account.processWithdrawal(100.00);

        // Test another deposit
        System.out.println("\n===== SECOND DEPOSIT TEST =====");
        account.deposit(50.00);
        System.out.println("Deposited: $50.00");
        System.out.printf("Balance: $%.2f%n", account.getBalance());

        // Test overdraft withdrawal
        System.out.println("\n===== OVERDRAFT TEST =====");
        account.processWithdrawal(600.00);

        // Display final account info
        System.out.println("\n===== FINAL ACCOUNT =====");
        account.displayAccount();
    }
}