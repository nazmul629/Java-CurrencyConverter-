import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        System.out.println("Select the currency to convert from:");
        displayCurrencyOptions();

        int fromCurrency = scanner.nextInt();
        double convertedAmount = convertCurrency(amount, fromCurrency);

        System.out.println("Select the currency to convert to:");
        displayCurrencyOptions();

        int toCurrency = scanner.nextInt();
        double finalAmount = convertCurrency(convertedAmount, toCurrency);

        System.out.println("Converted amount: " + finalAmount);
    }

    public static void displayCurrencyOptions() {
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. GBP");
        System.out.println("4. JPY");
        System.out.println("5. AUD");
        // Add more currency options as needed
    }

    public static double convertCurrency(double amount, int currency) {
        double conversionRate;

        switch (currency) {
            case 1: // USD to XYZ
                conversionRate = 0.85; // Replace with actual conversion rate
                break;
            case 2: // EUR to XYZ
                conversionRate = 1.12; // Replace with actual conversion rate
                break;
            case 3: // GBP to XYZ
                conversionRate = 1.38; // Replace with actual conversion rate
                break;
            case 4: // JPY to XYZ
                conversionRate = 0.0078; // Replace with actual conversion rate
                break;
            case 5: // AUD to XYZ
                conversionRate = 0.65; // Replace with actual conversion rate
                break;
            default:
                System.out.println("Invalid currency option");
                return 0;
        }

        return amount * conversionRate;
    }
}
