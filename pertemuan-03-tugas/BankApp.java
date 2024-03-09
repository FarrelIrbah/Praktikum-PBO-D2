import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Welcome to the Digital Bank!");

            System.out.print("Enter initial balance: ");
            double initialBalance = scanner.nextDouble();
            BankAccount account = new BankAccount(initialBalance);

            System.out.print("Enter withdrawal amount: ");
            double withdrawalAmount = scanner.nextDouble();
            account.withdraw(withdrawalAmount);
            System.out.println("Current balance: $" + account.getBalance());

        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
