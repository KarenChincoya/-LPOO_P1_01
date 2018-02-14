import java.util.Scanner;

public class TicketNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Input the ticket number: ");
        n = input.nextInt();
        System.out.println("Result: "+ ((((n-(n%10))/10)%7)==(n%10)?true:false));
    } 
}