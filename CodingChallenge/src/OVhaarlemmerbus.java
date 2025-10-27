import java.util.Scanner;
public class OVhaarlemmerbus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price;
        int age;
        System.out.println("New Trip Segment");
        System.out.println("Ticket type [single/day]?");
        String ticketType = sc.nextLine();
        if (ticketType.equalsIgnoreCase("single")){
            price = 3;
        System.out.println("Age");
        age = sc.nextInt();
        if (age < 18){
            price = 1.5;//50% off price
        }
        else if (age > 65){
            price = 2.1;//30% off price
        }
    }
        else if (ticketType.equalsIgnoreCase("day")){
        price = 7;}
        System.out.println("Hour");
        int hour = sc.nextInt();
        if (hour == 7){//7-9 and 16-18
            if (age > 18) {
                price = price + .5;
            }
        }
    }
}
