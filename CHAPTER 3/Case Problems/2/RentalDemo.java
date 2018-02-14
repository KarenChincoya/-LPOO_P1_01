import java.util.Scanner;

public class RentalDemo {
    public static void main(String args[]){
        Integer hours, minutes;
        String contractNumber;
        Scanner input = new Scanner(System.in);
        /*1st executable statement: calls a method that prompts the user for
            the rerntal time*/
        Rent e = new Rent();
        minutes = e.readMinutes();
        contractNumber = e.readContractNumber();
        e.setJustMinutes(minutes);
        e.setContractNumber(contractNumber);
        /* 2nd statement: calls the method that displays the company motto*/
        e.getMotto();
        /*The last statement, using the minutes */
        e.getTotal();
    }
}


import java.util.Scanner;
public class Rent {
    private Integer hours, minutes, total;
    private String contractNumber;
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
    public void setJustMinutes(int minutes){
      this.minutes = minutes%60;
      this.hours = (minutes-(minutes%60))/60;
    }
    public Integer getMinutes(){
      return minutes;
    }
    public void setContractNumber(String contractNumber){
      this.contractNumber = contractNumber;
    }
    public String getContractNumber(){
      return contractNumber;
    }
    public void getMotto(){
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("s\t\t\t\t\t\t S");
        System.out.println("S         Sammy�s makes it fun in the sun.       s");
        System.out.println("s\t\t\t\t\t\t S");
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
   }
    public void getTotal(){
        System.out.println("Hours\tMinutes\tTotal price");
        System.out.println("  "+this.hours+"\t"+this.minutes+"\t   "+this.hours*40+this.minutes);
    }
    public Integer readMinutes(){
      int minutes;
      Scanner input = new Scanner(System.in);

      System.out.println("You'll be asked the number of minutes you rented a piece of sports equipment");
      System.out.println("Input the number of minutes: ");
      minutes = input.nextInt();

      return minutes;
    }
    public String readContractNumber(){
      String contractNumber;
      Scanner input = new Scanner(System.in);
      System.out.println("Input your contractNumber: ");
      contractNumber = input.nextLine();
      return contractNumber;
    }

}
