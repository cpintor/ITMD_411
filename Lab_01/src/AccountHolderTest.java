/*
*
* Author: Cristian Pintor
* Course: ITMD 411
* Description: Bank program for depositing and withdrawing money.
*
* */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AccountHolderTest {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println("Current date = " + dateFormat.format(date));
        System.out.println("Programmed by Cristian Pintor");

        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Asking user for balance input
        System.out.println("Please enter your account balance: ");

        // Create numerical input for balance
        double balance_input = input.nextDouble();

        // If statement checking for at least a $50 deposit
        if (balance_input >= 50) {
            // AccountHolder object from constructor
            AccountHolder account = new AccountHolder(balance_input);

            account.deposit(balance_input);

            // Output
            System.out.println("Balance: " + balance_input);

            // Withdraw cash
            System.out.println("How much would you like to withdraw: ");
            double withdrawal_input = input.nextDouble();
            account.withdrawal(withdrawal_input);
            // Output
            System.out.println("Balance after withdrawal: " + account.getBalance());

            AccountHolder interest = new AccountHolder(balance_input - withdrawal_input);
            System.out.println("Interest rate: " );
            interest.monthlyInterest();
        } else {
            System.out.println("Sorry account must have at least $50 deposited.");
        }
    }
}
