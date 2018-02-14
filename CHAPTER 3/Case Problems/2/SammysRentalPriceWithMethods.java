import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String args[]){
        Integer hours, minutes;
        Scanner input = new Scanner(System.in);
        /*1st executable statement: calls a method that prompts the user for
            the rerntal time*/
        Rent e = new Rent();
        minutes = e.readMinutes();
        /* 2nd statement: calls the method that displays the company motto*/
        e.getMotto();
        /*The last statement, using the minutes */
        e.getTotal(minutes);
    }
}


import java.util.Scanner;
public class Rent {
    private Integer hours, minutes, total;
    public Rent(){
      this.hours = 0;
      this.minutes = 0;
    }
    public Rent(Integer hours, Integer minutes){
        this.hours = hours;
        this.minutes = minutes;
    }
    public void setHours(int hours){
      this.hours = hours;
    }
    public int getHours(){
      return hours;
    }
    public void setMinutes(int minutes){
      this.minutes = minutes;
    }
    public Integer getMinutes(){
      return minutes;
    }
    public void getMotto(){
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("s\t\t\t\t\t\t S");
        System.out.println("S         Sammy�s makes it fun in the sun.       s");
        System.out.println("s\t\t\t\t\t\t S");
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
   }
    public void getTotal(Integer minutes){
        Integer hours;
        hours = (minutes-(minutes%60))/60;
        minutes = minutes%60;
        System.out.println("Hours\tMinutes\tTotal price");
        System.out.println("  "+hours+"\t"+minutes+"\t   "+hours*40+minutes);
    }
    public Integer readMinutes(){
      int minutes;
      Scanner input = new Scanner(System.in);

      System.out.println("You'll be asked the number of minutes you rented a piece of sports equipment");
      System.out.println("Input the number of minutes: ");
      minutes = input.nextInt();

      return minutes;
    }
}
