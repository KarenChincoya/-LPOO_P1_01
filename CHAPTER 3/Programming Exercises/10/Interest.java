import java.util.Scanner;

public class Interest {
     public static void main(String[] args) {
        Double starting, ganancia;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the starting value of the investment: ");
	starting = input.nextDouble();
	YearInterest y = new YearInterest(starting);
        y.principal();
     }     
 }
public class YearInterest {
    /*invested at 5% interest for one year
	principal*/
	Double starting, ganancia;
	public YearInterest(Double starting){
            this.starting = starting;
        }
        public void principal(){
           Double y;
           y = yearInterest();
           System.out.println("Amount of money that you'll have after one year: $"+y);
        }

/*Interest function*/
	private Double yearInterest(){
		return starting*1.05;
	} 
}
