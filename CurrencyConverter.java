import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Currency Converter =====");

        // Input amount
        System.out.print("Enter amount in USD: ");
        double usd = sc.nextDouble();

        // Fixed exchange rate
        double rate = 83.0;

        // Conversion
        double inr = usd * rate;

        // Output
        System.out.println("Converted Amount:");
        System.out.println(usd + " USD = " + inr + " INR");

        sc.close();
    }
}