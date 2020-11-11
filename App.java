import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Welcome message (save and print)
        String welcome = "Welcome to a simple mortgage calculator!";
        System.out.println(welcome);

        // Principle (input reader)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principle: ");
        float principle = scanner.nextFloat();
        
        // Annual Interest Rate (input reader)
        System.out.print("Annual Interest Rate: ");
        float annualRate = scanner.nextFloat();
        
        // Period (input reader)
        System.out.print("Period (Years): ");
        int period = scanner.nextInt();

        // Mortgage Calculations
        double monthlyRate = (annualRate/100)/12;
        int payments = period * 12;
        double mortgage = principle * (monthlyRate *  Math.pow((1 + monthlyRate), payments)/Math.pow((1 + monthlyRate), payments)-1);
       
        // Print Mortgage
        System.out.print("Your mortgage is: " + mortgage);
    }
}