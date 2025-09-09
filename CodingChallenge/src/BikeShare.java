import java.util.Scanner;

public class BikeShare {
    public static void main(String[] args) {
        int minutes;
        double unlockFee = 3.90;
        double perMinute = 1.50;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter minutes ridden: ");
        minutes = scan.nextInt();
        double total = unlockFee + minutes * perMinute;
        System.out.println("Per-minute cost: " + total);
        double deviceFee = 0.01 * minutes;
        System.out.println("Device fee: " + deviceFee);
        double vatRate = 0.21;
        System.out.println("VAT: " + 1 + vatRate);


    }
}