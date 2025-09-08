import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CafeCheckout {
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
        // User input
        System.out.print("Enter number of coffee: ");
        numberOfCoffee = scan.nextInt();
        System.out.print("Enter number of tea: ");
        numberOfTea = scan.nextInt();
        System.out.print("Enter number of pastry: ");
        numberOfPastry = scan.nextInt();
        // Calculates subtotal
        double subTotal = (numberOfCoffee * priceOfCoffee) + (numberOfTea * priceOfTea) + (numberOfPastry * priceOfPastry);
        // Promo code input
        System.out.print("Enter Promo Code: ");
        String promoCode = scan.next();
        if (promoCode.equalsIgnoreCase("STUDENT10")) {
            double discount = subTotal * 0.10;
            subTotal -= discount;
            //shows how much money was subtracted after promo code
            System.out.printf("Promo code applied. 10%% discount: -$%.2f\n", discount);
            System.out.printf("Subtotal after discount: $%.2f\n", subTotal);
        }
        System.out.printf("Subtotal: $%.2f", subTotal);
        double totalWithVAT = subTotal * (1 + vatRate);
        double finalTotal = totalWithVAT * (1 + serviceFeeRate);
        finalTotal = (double) ((int) (finalTotal * 100 + 0.5)) / 100; // explicit casting?
        System.out.printf("\nTotal with VAT: $%.2f", totalWithVAT);
        System.out.printf("\nFinal Total with VAT and Service Fee: $%.2f", finalTotal);

    }
}