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
        System.out.println("C. Pintor | Lab 01");
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));

        // Create scanner object
        Scanner input = new Scanner(System.in);
        // Asking user for balance input
        System.out.println("Please enter your account balance: ");
        // Create numerical input
        double balance = input.nextDouble();

        // Output
        System.out.println("Balance: " + balance);

    }
}
