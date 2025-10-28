import java.util.Scanner;
public class OVhaarlemmerbus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = 0;

        System.out.println("Sell/Validate Ticket");
        System.out.println("Ticket type [single/day]?");
        String ticketType = sc.nextLine();

        System.out.println("Age");
        int age = sc.nextInt();

        System.out.println("Hour?");
        int hour = sc.nextInt();

        if (ticketType.equalsIgnoreCase("single")) {
            price = 3;
            if (age < 18) {
                price = 1.5;//50% off price
            } else if (age > 65) {
                price = 2.1;//30% off price
            }
        } else if (ticketType.equalsIgnoreCase("day")) {
            price = 7;
        }

        if ((hour >= 7 && hour <= 9) || (hour >= 16 && hour <= 18)) {
            if (age >= 18) {
                price += 0.5;
            }
        }
        System.out.println("Total price: " + price);
    }
}