import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Declaring Constant Varibles
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        // Initializing Scanner Object
        Scanner scanner = new Scanner(System.in);

        // Welcome message (save and print)
        String welcome = "Welcome To Your Simple Mortgage Calculator!";
        System.out.println(welcome);

        // Principle (question/input reader)
        System.out.print("Principle: ");
        int principle = scanner.nextInt();
        
        // Annual Interest Rate (question/input reader)
        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        
        // Period (question/input reader)
        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();

        // Mortgage Calculations
        float monthlyInterest = annualInterest/ PERCENT / MONTHS_IN_YEAR;
        int numberOfPayments = years * MONTHS_IN_YEAR;
        double mortgage = principle 
                    * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
       
        // Format Mortgage As Currency
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        // Print Mortgage
        System.out.println("Your mortgage is: " + mortgageFormatted);
    }
}