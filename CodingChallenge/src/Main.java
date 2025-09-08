import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numberOfCoffee;
        int numberOfTea;
        int numberOfPastry;
        double priceOfCoffee = 2.10;
        double priceOfTea = 1.60;
        double priceOfPastry = 2.75;
        double vatRate = 0.21;
        double serviceFeeRate = 0.30;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of coffee: ");
        numberOfCoffee = scan.nextInt();
        System.out.print("Enter number of tea: ");
        numberOfTea = scan.nextInt();
        System.out.print("Enter number of pastry: ");
        numberOfPastry = scan.nextInt();
        double subTotal = (numberOfCoffee * priceOfCoffee) + (numberOfTea * priceOfTea) + (numberOfPastry * priceOfPastry);
        System.out.printf("Subtotal: $%.2f", subTotal);
        double totalWithVAT = subTotal * (1 + vatRate);
        double finalTotal = totalWithVAT * (1 + serviceFeeRate);
        System.out.printf("\nTotal with VAT: $%.2f", totalWithVAT);
        System.out.printf("\nFinal Total with VAT and Service Fee: $%.2f", finalTotal);
        System.out.print("Enter Promo Code: ");
        String promoCode = scan.next();

    }
}