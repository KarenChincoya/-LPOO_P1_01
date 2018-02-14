import java.util.Scanner;

public class MetricConversion {
     public static void main(String[] args) {
        Double x;
        Double y;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of inches: ");
        x = input.nextDouble();
        System.out.println("Input the number of gallons: ");
        y = input.nextDouble();
        Number n = new Number(x,y);
        n.conversion(x,y);
    }     
 }
public class Number {
    Double x;
    Double y;
    public Number(Double x, Double y){
        this.x = x;
        this.y = y;
    }
    public void conversion(Double x, Double y){
        System.out.println(x +"inches equals "+x*2.54+" cm.");
        System.out.println(y +"inches equals "+y*3.7854+" cm.");
    }
}
