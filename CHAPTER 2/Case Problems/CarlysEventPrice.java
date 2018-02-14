import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
        int guests, total;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of guests: ");
        guests = input.nextInt();
        Event e = new Event(guests);
        e.getMotto();
        e.getTotal();
    } 
}

public class Event {
    int guests, total;
    
    public Event(Integer guests){
        this.guests = guests;
    }
    
    public void setGuests(Integer guests){//getter
        this.guests = guests;
    }
    public void getMotto(){
            System.out.println("*************************************************");
            System.out.println("*\t\t\t\t\t\t*");
            System.out.println("* Carly’s makes the food that makes it a party. *");
            System.out.println("*\t\t\t\t\t\t*");
            System.out.println("*************************************************");
    }
    public void getTotal(){
        System.out.println("Number of guests  Price per guest  Total price");
        System.out.println("\t"+ guests+"\t\t$35\t\t"+guests*35);
        System.out.println((guests>=50)?"The job is a large event": "The event IS NOT a large event.");   
    }
}
