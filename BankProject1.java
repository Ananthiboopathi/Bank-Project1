import java.util.Scanner;

public class BankProject1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.00; // Initial balance

        while (true) {
            System.out.println(" Welcome to the Bank Management System");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Your current balance is ₹" + balance);
            } else if (choice == 2) {
                System.out.print("Enter amount to deposit: ₹");
                double deposit = scanner.nextDouble();
                if (deposit > 0) {
                    balance += deposit;
                    System.out.println(" ₹" + deposit + " deposited successfully.");
                } else {
                    System.out.println(" Invalid deposit amount.");
                }
            } else if (choice == 3) {
                System.out.print("Enter amount to withdraw: ₹");
                double withdraw = scanner.nextDouble();
                if (withdraw > 0 && withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println(" ₹" + withdraw + " withdrawn successfully.");
                } else {
                    System.out.println(" Insufficient balance or invalid amount.");
                }
            } else if (choice == 4) {
                System.out.println(" Thank you for using the Bank Management System. Goodbye!");
                break;
            } else {
                System.out.println(" Invalid option. Please try again.");
            }
        }
;
    }
}