import java.util.Scanner;

public class Salary {
     public static void main(String[] args) {
        Double payRate, regularHours, overHours;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the hourly pay rate: ");
        payRate = input.nextDouble();
        System.out.println("Input your regular hours: ");
        regularHours = input.nextDouble();
        System.out.println("Input your overtime hours: ");
        overHours = input.nextDouble();
        Salary s = new Salary(payRate, regularHours, overHours);
        s.principal();
     }     
 }
public class Salary {

/*Weekly salary for an employee
	Pincipal*/
    Double payRate, regularHours, overHours, result;
    public Salary(Double payRate, Double regularHours, Double overHours){
        this.payRate = payRate;
        this.regularHours = regularHours;
        this.overHours = overHours;
    }
    public void principal(){
        Double result;
        result = totalSalary();
        System.out.println("The week salary is: $"+result);

    }
//method 
    private Double totalSalary(){
	return (payRate*regularHours+(payRate*overHours*1.5));
    }    
}
