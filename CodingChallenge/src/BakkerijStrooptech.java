import java.util.Scanner;
public class BakkerijStrooptech {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double revenue = 0;
        int numberOfCustomers;
        int stroopwafelSold;
        int breadSold;
        int coffeeSold;
        int croissantSold;
        int numberOfCombos;
        int largestOrder;
        int stockOfStroopwafel = 30;
        int stockOfBread = 20;
        int stockOfCroissant = 25;
        int stockOfCoffee = 40;
        int Waste;
        int hour = 0;
        double priceOfStroopwafel = 2.50;
        double priceOfBread = 3.00;
        double priceOfCoffee = 2.00;
        double priceOfCroissant = 1.50;
        String customerName;
        int orderHour;
        int systemOpen = 1;

        while (systemOpen > 0) {
            System.out.println("Customer Name?");//try to reset variables at beginning of loop
            customerName = sc.nextLine();
            System.out.println("Order hour (0-23)?");
            orderHour = sc.nextInt();
            if (orderHour < 10) {
                priceOfStroopwafel = priceOfStroopwafel - .25;
            }
            System.out.println("Stroopwafels:");
            stroopwafelSold = sc.nextInt();
            System.out.println("Breads:");
            breadSold = sc.nextInt();
            System.out.println("Croissants:");
            croissantSold = sc.nextInt();
            System.out.println("Coffee:");
            coffeeSold = sc.nextInt();
            double orderTotal = stroopwafelSold * priceOfStroopwafel + breadSold * priceOfBread + coffeeSold * priceOfCoffee + croissantSold * priceOfCroissant;
            System.out.println("Order total: €" + orderTotal);
            revenue = revenue + orderTotal;
            systemOpen = sc.nextInt();//how do I set system open to 0?
        }

    }
}
