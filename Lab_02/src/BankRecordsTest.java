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

public class BankRecordsTest {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println("Current date = " + dateFormat.format(date));
        System.out.println("Programmed by Cristian Pintor");

        System.out.println("ID\t\tAGE\tSEX\t\tREGION\tINCOME\tMORTGAGE");
        BankRecords bankRecords = new BankRecords(); // Creating object for records.
        bankRecords.readData(); // Calling readData method
        bankRecords.processData();
    }
}
