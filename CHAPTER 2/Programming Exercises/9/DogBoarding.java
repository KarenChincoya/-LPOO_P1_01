import java.util.Scanner;

public class DogBoarding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pounds, days,cost;
        System.out.println("What's the dog's weight (in pounds)? ");
        pounds = input.nextDouble();
        System.out.println("How many days will the dog board? ");
        days = input.nextDouble();
        cost = 0.5 * pounds * days;
        System.out.print("The total price for boarding is: " + cost +" dollars.\n");
    } 
}