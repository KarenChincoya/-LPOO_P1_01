import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {
        int hours, minutes;
        Scanner input = new Scanner(System.in);
        System.out.println("You'll be asked the number of hours and minutes you rented a piece of sports equipment");
        System.out.println("Input the number of hours: ");
        hours = input.nextInt();
        System.out.println("Input the number of minutes: ");
        minutes = input.nextInt();
        Rent e = new Rent(hours, minutes);
        e.getMotto();
        e.getTotal();
    } 
}
public class Rent {
    int hours, minutes, total;
    
    public Rent(Integer hours, Integer minutes){
        this.hours = hours;
        this.minutes = minutes;
    }
    public void getMotto(){
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("s\t\t\t\t\t\t S");
        System.out.println("S         Sammy’s makes it fun in the sun.       s");
        System.out.println("s\t\t\t\t\t\t S");
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
   }
    public void getTotal(){
        System.out.println("Hours\tMinutes\tTotal price");
        System.out.println("  "+hours+"\t"+minutes+"\t   "+hours*40+minutes);
    }
}
