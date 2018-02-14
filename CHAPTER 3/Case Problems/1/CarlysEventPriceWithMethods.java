import java.util.Scanner;

public class CarlysEventPriceWithMethods {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Integer guests;
        Event e = new Event();
        guests = e.readGuests();
        e.displayMotto();
        e.ticket(guests);
    }
}
import java.util.Scanner;
public class Event {
    int guests, total;
    
    public Event(){
        this.guests = 0;
    }
    public Event(Integer guests){
        this.guests = guests;
    }
    
    public void setGuests(Integer guests){//getter
        this.guests = guests;
    }
    public static int readGuests(){
	Scanner input = new Scanner(System.in);	
	Integer guests;
	System.out.println("Input the number of guests: ");
	guests = input.nextInt();
	return guests;
    }
    public static void displayMotto(){
            System.out.println("*************************************************");
            System.out.println("*\t\t\t\t\t\t*");
            System.out.println("* Carly’s makes the food that makes it a party. *");
            System.out.println("*\t\t\t\t\t\t*");
            System.out.println("*************************************************");
    }
    public static void ticket(Integer guests){//con parametro porque es static
        System.out.println("Number of guests  Price per guest  Total price");
        System.out.println("\t"+ guests+"\t\t$35\t\t"+guests*35);
        System.out.println((guests>=50)?"The job is a large event": "The event IS NOT a large event");   
    }
           
}
